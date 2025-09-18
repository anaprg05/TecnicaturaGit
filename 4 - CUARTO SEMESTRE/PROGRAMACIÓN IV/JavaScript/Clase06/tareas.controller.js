import { pool } from '../db.js';

export const listarTareas = (req, res) => res.send('Obteniendo tareas...');

export const listarTarea = (req, res) => res.send('Obteniendo tarea única...');

export const crearTarea = async(req, res, next) => {
    const { titulo, descripcion } = req.body;

    try {
        const {result} = await pool.query('INSERT INTO tareas (titulo, descripcion) VALUES ($1, $2) RETURNING *', [titulo, descripcion]);
        res.json(result.rows[0]);
        console.log(result.rows[0]);
        /*console.log(rows);
        res.send('Creando tarea...');
        */
    } catch (error) {
        if (error.code === '23505'){
            return res.send('Ya existe una tarea con ese nombre');
        }
        console.log(error);
        next(error);  
    }

}

export const actualizarTarea = (req, res) => res.send('Actualizando tarea única...');

export const eliminarTarea = (req, res) => res.send('Eliminando tarea única...');
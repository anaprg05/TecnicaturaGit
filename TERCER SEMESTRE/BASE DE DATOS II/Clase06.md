# 🗄️ Base de Datos No Relacionales - MongoDB
## 🗑️ Comandos para Eliminar Datos
### 🔍 Primeros pasos
```javascript
use NombreDeLaBase  // Seleccionamos la base de datos
show collections    // Visualizamos las colecciones disponibles
```

🔹 REMOVE()
```javascript
db.insert.remove({"nombre":"natalia"})
```
- Función: Elimina documentos específicos de una colección

🔹 DELETEONE()
```javascript
db.insert.deleteOne({"nombre":"juan"})
```
- Función: Elimina un único documento que coincida con el criterio

---

## 🗂 Eliminar Colecciones
### 🔥 DROP()
```javascript
db.insert.drop("nombre_de_la_colección")
// Retorna: true (confirmación de eliminación)
```
- Función: Elimina colecciones completas (vacías o en uso)

---

## 🔄 Actualizaciones de Datos
### ✏️ UPDATEONE() + $SET
```javascript
db.insertar.updateOne(
  {"nombre":"Luis"},          // 1° Parámetro: Filtro
  {$set:{"ubicación":"Buenos Aires"}}  // 2° Parámetro: Actualización
)
```

### ✏️ UPDATEMANY()
```javascript
db.insertar.updateMany(
  {"nombre":"Julian"},
  {$set:{"edad":"25"}}
)
```

### 🧹 $UNSET
```javascript
db.insertar.updateOne(
  {"nombre":"Luis"},
  {$unset:{"ubicación":""}}  // Elimina campos específicos
)
```

### ✂️ $RENAME
```javascript
db.insertar.updateOne(
  {"Nombre":"Kevin"},
  {$rename:{"ubicación":"ciudad"}}  // Renombra campos
)
```

### 🔼 $MAX
```javascript
db.insertar.updateOne(
  {"Nombre":"Lucas"},
  {$max:{"time":1000}}  // Actualiza solo si el valor es mayor
)
```

### 🔽 $MIN
```javascript
db.insertar.updateOne(
  {"Nombre":"kevin"},
  {$min:{"time":1000}}  // Actualiza solo si el valor es menor
)
```

---

## ➕ Incremento ($INC)
### 📈 Ejemplo Práctico
```javascript
// Insertar documento inicial
db.incremento.insertOne({
  "Nombre":"youtube",
  "url":"www.youtube.com",
  "vistas":1000,
  "likes":50
})

// Incrementar valores
db.incremento.update(
  {"url":"www.youtube.com"},
  {$inc:{"vistas":1000}}  // Aumenta vistas en 1000
)

// Ver resultado
db.incremento.find()
```

---

## 🔍 Consultas
### 📂 FIND()
```javascript
// Insertar múltiples documentos
db.selection.insertMany([
  {"nombre":"jesica","edad":20},
  {"nombre":"fernando","edad":20}
])

// Consultar específicos
db.seleccion.find({
  "nombre":{$in:["jesica","fernando"]}
})
```

🔎 FINDONE()
```javascript
db.primer_metodo.findOne({"nombre":"Fernando"})
```

> Nota: Retorna solo el primer documento que coincida con el criterio

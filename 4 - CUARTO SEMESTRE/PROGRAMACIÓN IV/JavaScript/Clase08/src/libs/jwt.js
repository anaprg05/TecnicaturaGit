import jwl from "jsonwebtoken";
import { token } from "morgan";

export const createAccessToken = (paylod) => {
    return new Promise((resolve, reject) => {
        jwl.sign(paylod, "xyz123", { expiresIn: "1d" },
        (err, token) => {
            if (err) {
                resolve(token);
            }
        });
    });
};
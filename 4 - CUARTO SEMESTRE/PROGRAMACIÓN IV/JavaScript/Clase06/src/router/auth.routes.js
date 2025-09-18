import { Router } from "express";
import { singin, singup, singout, profile } from "../controllers/auth.controller.js"

const router = Router();

router.post("/signin", singin);

router.post("/signup", singup);

router.post("/signout", singout);

router.get("/profile", profile);

export default router;
import axios from "axios";

// const url = "http://localhost:8000"; //Python
const url = "http://localhost:8080"; //Java

export const ApiService = axios.create({
    baseURL: url,
    headers: {
        "Content-Type": "application/json"
    }
});

import axios from "axios";

export const dataLoader = () =>
  axios
    .get("http://localhost:8080/get")
    .then((response) => {
      return response;
    })
    .catch((error) => {
      return error;
    });

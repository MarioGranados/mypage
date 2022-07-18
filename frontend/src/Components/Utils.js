import axios from 'axios';

export const USER_API_BASE_URL = "http://localhost:8080/api/users";

export const createUser = (user) => {
    fetch(USER_API_BASE_URL, {
        method: 'POST',
        body: JSON.stringify(user),
        headers: {
            'Content-type': 'application/json; charset=UTF-8',
        },
    })
        .then((response) => response.json())
        .then((json) => console.log(json));
}

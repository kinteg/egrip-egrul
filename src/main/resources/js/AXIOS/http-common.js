import axios from 'axios'

export const AXIOS = axios.create({
    baseURL: `/api`
});

AXIOS.interceptors.request.use(config => {
    NProgress.start();
    return config
});

AXIOS.interceptors.response.use(response => {
    NProgress.done();
    return response
});

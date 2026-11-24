// Cliente HTTP base. Toda comunicação com o back-end passa por aqui.
const BASE_URL = '/api';

export async function requisicao(caminho, { metodo = 'GET', corpo, params } = {}) {
  throw new Error('TODO');
}
export const get  = (caminho, params) => requisicao(caminho, { params });
export const post = (caminho, corpo, params) => requisicao(caminho, { metodo: 'POST', corpo, params });
export const put  = (caminho, corpo) => requisicao(caminho, { metodo: 'PUT', corpo });
export const del  = (caminho) => requisicao(caminho, { metodo: 'DELETE' });

# objetosservicio_00000279037
servicio codigos, fechas y cadenas

# Instalación de la librería con Maven
Esta librería se distribuye mediante GitHub Packages y puede agregarse a cualquier proyecto Maven.

## 1. Crear un Personal Access Token en GitHub
Debes generar un token en GitHub con el siguiente permiso:

- `read:packages`

## 2. Configurar la variable de entorno
En Windows ejecuta en la terminal:

```bash
setx GITHUB_TOKEN "TU_TOKEN_AQUI"

Después de esto Maven podrá acceder al repositorio y importar la librería
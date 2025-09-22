/*
Dada una matriz de booleanos de n filas y m columnas con n impar. Se sabe que 
hay exactamente una fila que no está repetida, y el resto se encuentra 
exactamente dos veces en la matriz.

a) Escribir un programa que devuelva un vector con los valores de la fila que 
no se repite. ¿Cuál es su tiempo de ejecución de peor caso descripto?

b) ¿Es posible un programa que recorra cada casillero de la matriz sólo una 
vez? En caso de no haberlo resuelto con esta restricción, modificar el 
programa para que la cumpla. ¿Cuál es su tiempo de ejecución de peor 
caso?

c) La solución al punto anterior, ¿utiliza vectores auxiliares?, en caso que 
lo haga, escribir un programa que no los necesite.
*/

/*
{1, 0, 1, 0, 1, 0, 1, 0, 1},  // Fila A
{0, 0, 0, 0, 0, 0, 0, 0, 0},  // Fila B
{1, 0, 1, 0, 1, 0, 1, 0, 1},  // Fila A
{1, 1, 1, 1, 1, 1, 1, 1, 1},  // Fila C
{0, 1, 0, 1, 0, 1, 0, 1, 0},  // Fila D
{1, 1, 1, 1, 1, 1, 1, 1, 1},  // Fila C
{0, 0, 0, 0, 0, 0, 0, 0, 0},  // Fila B
{0, 1, 0, 1, 0, 1, 0, 1, 0},  // Fila D
{1, 1, 0, 1, 0, 0, 1, 0, 1}   // ❗Fila única (sin par)

{0,1,1}
{0,1,1}
{1,1,1}
{1,1,1}
{0,0,1}
*/

vector<boolean> filaUnicaEnLugar(std::vector<std::vector<int>>& matriz) {
    int n = matriz.size();
    int m = matriz[0].size();

    for (int i = 1; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matriz[0][j] ^= matriz[i][j];  // acumulamos el XOR en la primera fila
        }
    }
    return matriz[0];
}

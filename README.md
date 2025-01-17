Proyecto: Árboles Binarios
Descripción de la Versión Actual
Esta versión del proyecto incluye implementaciones prácticas sobre árboles binarios desarrolladas en Java. Cada ejercicio abarca un aspecto clave de las estructuras de datos, ayudando a comprender sus fundamentos y manipulaciones. A continuación, se detalla cada ejercicio junto con su aporte a la funcionalidad del proyecto.

Estructura del Proyecto
El proyecto se organiza en varios paquetes, cada uno representando un ejercicio específico. Los ejercicios implementados son:

Inserción en un Árbol Binario de Búsqueda
Inversión de un Árbol Binario
Cálculo de la Profundidad Máxima de un Árbol
Clases y Funcionalidades

Ejercicio 1: Inserción en un Árbol Binario de Búsqueda
Clase: InsertBSTTest
Descripción: Esta clase implementa la lógica para insertar valores en un árbol binario de búsqueda (BST). Permite organizar los datos en un orden que facilite su recuperación. Los nodos a la izquierda de cada nodo contienen valores menores, mientras que los de la derecha contienen valores mayores.
Métodos Clave:
insert(Node root, int value): Inserta un valor en el árbol siguiendo las reglas del BST. Crea un nuevo nodo si el árbol está vacío; de lo contrario, recorre recursivamente los subárboles izquierdo o derecho según corresponda.
printTreeAligned(Node root): Imprime el árbol en un formato visualmente alineado para facilitar su análisis.

Ejercicio 2: Inversión de un Árbol Binario
Clase: InvertBinaryTree
Descripción: Proporciona la funcionalidad para invertir un árbol binario intercambiando los subárboles izquierdo y derecho de cada nodo. Este proceso se lleva a cabo mediante una función recursiva.
Métodos Clave:
invertTree(Node root): Invierte los subárboles de cada nodo del árbol binario recursivamente. Si el nodo es nulo, retorna nulo; de lo contrario, intercambia los subárboles.
printTreeAligned(Node root): Genera una representación visual alineada del árbol para facilitar su comprensión, igual que en el Ejercicio 1.

Ejercicio 3: Cálculo de la Profundidad Máxima de un Árbol
Clase: Depth
Descripción: Calcula la profundidad máxima de un árbol binario, también conocida como altura. Este cálculo determina el número máximo de niveles o capas desde la raíz hasta la hoja más lejana.
Métodos Clave:
maxDepth(Node root): Retorna la profundidad máxima del árbol. Si el nodo es nulo, retorna 0. En caso contrario, utiliza recursión para sumar 1 al mayor valor entre las profundidades de los subárboles izquierdo y derecho.
printInput(Node root): Muestra el árbol en formato visual antes de calcular su profundidad, facilitando la verificación de resultados.
Clase Principal: App
Descripción: La clase App es el punto de entrada del programa. Contiene métodos que ejecutan cada ejercicio, creando árboles de ejemplo, realizando las operaciones correspondientes y mostrando los resultados en consola.

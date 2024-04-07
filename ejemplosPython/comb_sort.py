# Ejemplo comb sort
def sort(arr):
    n = len(arr)
    # inicializar el gap
    gap = n

    # inicializar el swap como true para asegurar que se ejecute al menos una vez
    swapped = True

    # Mantener ejecutando mientras gap es más que 1 y la última iteración causó un swap
    while gap != 1 or swapped:
        # Encuentra el siguiente gap
        gap = (gap * 10) // 13
        if gap < 1:
            gap = 1
        # verificar el swapped
        swapped = False
        # Comparar todos los elementos
        for i in range(n - gap):
            if arr[i] > arr[i + gap]:
                # swap arr[i] y arr[i+gap]
                arr[i], arr[i + gap] = arr[i + gap], arr[i]
                # set swapped
                swapped = True

arr = [9, 8, 7, 6, 5, 4, 3, 2, 1]
sort(arr)

print("Números ordenados:")
for i in range(len(arr)):
    print(arr[i], end=" ")
print()
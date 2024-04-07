# Ordenamiento burbuja con la lista  [54,26,93,17,77,31,44,55,20]

def bubbleSort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr
# mostrat el resultado en consola
arr = [54,26,93,17,77,31,44,55,20]
print("Lista original:\n ", arr)
print("\n----------- Ordenando la lista -----------\n")
print("\nLista ordenada por el metodo de burbuja: \n", bubbleSort(arr))
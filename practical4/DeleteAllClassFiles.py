import os

def delete_class_files(directory):
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith(".class"):
                file_path = os.path.join(root, file)
                os.remove(file_path)
                print(f"Deleted: {file_path}")

if __name__ == "__main__":
    directory = "./"
    delete_class_files(directory)
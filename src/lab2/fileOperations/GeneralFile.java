package lab2.fileOperations;
abstract class GeneralFile {
    // base class meant to be subclassed and serve as a general structure between the other types
        String fileName;
        String fileExtension;
        String fileCreatedDate;
        String fileModifiedDate;

        public GeneralFile(String fileName, String extension, String createdDate, String lastModifiedDate) {
            this.fileName = fileName;
            this.fileExtension = extension;
            this.fileCreatedDate = createdDate;
            this.fileModifiedDate = lastModifiedDate;
        }

        @Override // dynamic run-time polymorphism
        public String toString() {
            return super.toString(); // provides a custom representation instead of just class name and hash code
        }
    }


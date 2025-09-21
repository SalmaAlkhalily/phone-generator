# Phone Generator

A Java Swing desktop application that generates sequential phone numbers for a specified country and exports them as VCF (vCard) files for easy import into contact management systems.

## Features

- **Phone Number Generation**: Generate sequential phone numbers based on user-defined parameters
- **Country Support**: Configurable country codes and naming
- **Customizable Parameters**: 
  - Country name and code
  - Phone number prefix/start digits
  - Total length of phone numbers
  - Number of phone numbers to generate
- **VCF Export**: Automatically exports generated phone numbers as individual VCF (vCard) files
- **Contact Management**: Generated contacts can be easily imported into phone contact lists
- **Persistent Storage**: Maintains state between sessions to continue number generation
- **User-friendly GUI**: Simple and intuitive Swing-based interface

## Project Structure

```
PhoneGenerator/
├── src/phonegenerator/
│   ├── PhoneGenerator.java      # Main class and application entry point
│   ├── Splach_Screen.java       # Splash screen on startup
│   ├── Settings.java            # Settings/configuration window
│   ├── Generate.java            # Main phone generation interface
│   ├── GeneratingProcess.java   # Core phone number generation logic
│   └── ViewGeneratedPhones.java # Display and export generated numbers
├── build/                       # Compiled classes
├── countries/                   # Country-specific phone number files
├── mycontacts/                  # Generated VCF files
├── Images/                      # Application images/icons
├── build.xml                    # Ant build configuration
└── manifest.mf                  # JAR manifest file
```

## How It Works

1. **Splash Screen**: Application starts with a splash screen
2. **Settings**: Configure application preferences
3. **Phone Generation**: 
   - Enter country name
   - Enter country code (e.g., +963 for Syria)
   - Enter phone number prefix/start digits
   - Specify total phone number length
   - Set number of phone numbers to generate
4. **Generation Process**: Creates sequential phone numbers starting from the specified parameters
5. **VCF Export**: Each generated phone number is saved as a VCF file in the `mycontacts` directory
6. **State Persistence**: The application remembers the last generated number to continue sequences

## Requirements

- Java SE 8 or higher
- Java Swing (included in standard Java distribution)

## Building and Running

### Using Any Java IDE (NetBeans, Eclipse, IntelliJ IDEA, etc.)
1. Open the project in your preferred Java IDE
2. Build and run the project using the IDE controls
3. The main class is `phonegenerator.PhoneGenerator`

### Using Command Line with Ant
```bash
# Build the project
ant clean compile

# Run the application
ant run
```

### Manual Compilation
```bash
# Compile all Java files
javac -d build/classes src/phonegenerator/*.java

# Run the application
java -cp build/classes phonegenerator.PhoneGenerator
```

## Usage Example

1. Launch the application
2. Enter the following parameters:
   - **Country name**: Syria
   - **Country code**: 00963
   - **Start of phone**: 900000000
   - **Length**: 14
   - **Number to generate**: 100

3. Click "Generate" to create 100 sequential phone numbers:
   - 00963900000000
   - 00963900000001
   - 00963900000002
   - ... and so on

4. VCF files will be created in the `mycontacts` directory with names like:
   - `Syria00963900000000.vcf`
   - `Syria00963900000001.vcf`
   - etc.

## Output Format

Each generated VCF file contains contact information in the standard vCard format:

```
BEGIN:VCARD
VERSION:2.1
N;CHARSET=UTF-8;ENCODING=QUOTED-PRINTABLE:;=Syria00963900000000;;;
FN;CHARSET=UTF-8;ENCODING=QUOTED-PRINTABLE:=Syria00963900000000
TEL;CELL:00963900000000
END:VCARD
```

## File Locations

- **Generated VCF files**: `%USERPROFILE%\My Documents\Phone Generator\mycontacts\`
- **Country data files**: `%USERPROFILE%\My Documents\Phone Generator\countries\`

## Features in Detail

### Sequential Generation
The application maintains the last generated phone number in country-specific files, ensuring continuous sequential generation across multiple sessions.

### Input Validation
- Validates that numeric fields contain only digits
- Provides error messages for invalid input
- Prevents generation with invalid parameters

### Cross-platform Compatibility
Built with Java Swing for cross-platform desktop compatibility.

## Contributing

This is an educational/utility project. Feel free to fork and enhance with additional features such as:
- Different phone number formats
- Bulk export options
- CSV export functionality
- Additional contact fields
- International format support

## Authors

- **Salma** - Main developer
- **Yara** - Co-developer

## License

This project was developed as a custom solution for a client. All rights reserved to the project commissioner.
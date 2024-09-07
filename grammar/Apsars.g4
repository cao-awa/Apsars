grammar Apsars;

import ApsarsRules, ApsarsMethod, ApsarsClass;

// File entry.
program: definePackage? defineImport* defineClass* ? ;

definePackage: packageAt packageIdentifier semicolon;

defineImport: importting fullNameIdentifier semicolon;


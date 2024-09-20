grammar PureApsars;

import PureApsarsRules, PureApsarsMethod, PureApsarsClass;

// File entry.
program: definePackage? defineImport* defineClass* ? ;

definePackage: packageAt packageIdentifier semicolon;

defineImport: importting fullNameIdentifier semicolon;


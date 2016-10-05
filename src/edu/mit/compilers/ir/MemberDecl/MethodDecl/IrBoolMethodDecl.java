package edu.mit.compilers.ir;
import java.util.*;

public class IrBoolMethodDecl extends IrMethodDecl {

    public IrBoolMethodDecl(IrType returnType,  List<IrParamDecl> paramsList,
                           IrCodeBlock methodBody, IrIdent name, int lineNumber, int colNumber) {
        super(returnType, paramsList, methodBody, name, lineNumber, colNumber);
    }

}
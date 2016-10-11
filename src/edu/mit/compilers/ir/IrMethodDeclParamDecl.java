package edu.mit.compilers.ir;

public class IrMethodDeclParamDecl extends Ir {
    private final IrType paramType;
    private final IrIdent paramName;

    public IrMethodDeclParamDecl(IrType paramType, IrIdent paramName) {
        super(paramName.getLineNumber(), paramName.getColNumber());
        this.paramType = paramType;
        this.paramName = paramName;
    }
    public String toString(){
        return paramType.toString() + " " + paramName.toString();
    }
}
package edu.mit.compilers.ir;

/**
 * Created by devinmorgan on 10/5/16.
 */
public class IrLocationVar extends IrLocation {
    public IrLocationVar(IrIdent varName, IrType varType, int lineNumber, int colNumber) {
        super(varName, varType,lineNumber, colNumber);
    }

    @Override
    public IrType getExpressionType() {
        return this.varType;
    }
}
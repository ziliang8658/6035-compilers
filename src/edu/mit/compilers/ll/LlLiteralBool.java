package edu.mit.compilers.ll;

/**
 * Created by devinmorgan on 11/18/16.
 */
public class LlLiteralBool extends LlLiteral {
    private final boolean boolValue;

    public LlLiteralBool(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public boolean getBoolValue() {
        return this.boolValue;
    }

    @Override
    public String toString() {
        return Boolean.toString(this.boolValue);
    }
}

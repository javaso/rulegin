
package tb.rulegin.server.core.rule;

public class RuleException extends Exception {

    private static final long serialVersionUID = 1L;

    public RuleException(String msg) {
        super(msg);
    }

    public RuleException(String msg, Exception e) {
        super(msg, e);
    }

}

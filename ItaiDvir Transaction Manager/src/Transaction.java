public class Transaction implements Comparable<Transaction> {
    private Long transactionId;
    private String accountNumber;
    private Double amount;
    private long timestamp;
    private String description;
    private TransactionType transactionType;

    public

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }
}

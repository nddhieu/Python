package pending;
import java.util.*;

public class TransactionSystem {

    /*
     * PROBLEM: (Mini System Design)
     * Implement a simple banking system that supports:
     * 1. CREATE_ACCOUNT(id): Create a new account. Return false if exists.
     * 2. DEPOSIT(id, amount): Add amount to account balance. Return false if not
     * found.
     * 3. TRANSFER(from_id, to_id, amount): Transfer money if balance is sufficient.
     * 4. GET_BALANCE(id): Return current balance.
     *
     * This tests basic HashMap usage and logic handling.
     */

    private Map<String, Integer> accounts = new HashMap<>();

    public boolean createAccount(String id) {
        if (accounts.containsKey(id))
            return false;
        accounts.put(id, 0);
        return true;
    }

    public boolean deposit(String id, int amount) {
        if (!accounts.containsKey(id))
            return false;
        accounts.put(id, accounts.get(id) + amount);
        return true;
    }

    public boolean transfer(String fromId, String toId, int amount) {
        if (!accounts.containsKey(fromId) || !accounts.containsKey(toId))
            return false;
        if (accounts.get(fromId) < amount)
            return false;

        accounts.put(fromId, accounts.get(fromId) - amount);
        accounts.put(toId, accounts.get(toId) + amount);
        return true;
    }

    public int getBalance(String id) {
        return accounts.getOrDefault(id, -1);
    }

    public static void main(String[] args) {
        TransactionSystem system = new TransactionSystem();
        System.out.println("Create Account A: " + system.createAccount("A"));
        System.out.println("Deposit 100 to A: " + system.deposit("A", 100));
        System.out.println("Create Account B: " + system.createAccount("B"));
        System.out.println("Transfer 30 A -> B: " + system.transfer("A", "B", 30));
        System.out.println("Balance A: " + system.getBalance("A") + " (expected 70)");
        System.out.println("Balance B: " + system.getBalance("B") + " (expected 30)");
    }
}

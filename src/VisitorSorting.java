import java.util.Comparator;

public class VisitorSorting implements Comparator<Visitor>{
    public int compare(Visitor v1, Visitor v2) {
        int TicketTypeSorting = v1.getTicketType().compareTo(v2.getTicketType());
        if (TicketTypeSorting != 0) {
            return TicketTypeSorting;
        }
        return Integer.compare(v1.getId(), v2.getId());
    }
}

package u;

import java.util.List;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6808c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(List list, int i8) {
        int size = list.size();
        if (i8 < 0 || i8 >= size) {
            throw new IndexOutOfBoundsException("Index " + i8 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List list, int i8, int i9) {
        int size = list.size();
        if (i8 > i9) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i8 + ") is greater than toIndex (" + i9 + ").");
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i8 + ") is less than 0.");
        }
        if (i9 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is more than than the list size (" + size + ')');
    }
}

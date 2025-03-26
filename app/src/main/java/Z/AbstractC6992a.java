package z;

import I6.l;
import java.util.List;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6992a {
    private static final void a(Appendable appendable, Object obj, l lVar) {
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    private static final Appendable b(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, l lVar) {
        appendable.append(charSequence2);
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            i9++;
            if (i9 > 1) {
                appendable.append(charSequence);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            a(appendable, obj, lVar);
        }
        if (i8 >= 0 && i9 > i8) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, l lVar) {
        return ((StringBuilder) b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i8, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return c(list, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }
}

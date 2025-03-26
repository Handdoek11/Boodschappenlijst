package y6;

import J6.AbstractC0650j;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: y6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6977e extends AbstractC6973a implements Set, K6.a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f44651o = new a(null);

    /* renamed from: y6.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final boolean a(Set set, Set set2) {
            J6.r.e(set, AdActionType.CONTENT);
            J6.r.e(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(Collection collection) {
            J6.r.e(collection, AdActionType.CONTENT);
            Iterator it = collection.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i8 += next != null ? next.hashCode() : 0;
            }
            return i8;
        }

        private a() {
        }
    }

    protected AbstractC6977e() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f44651o.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f44651o.b(this);
    }
}

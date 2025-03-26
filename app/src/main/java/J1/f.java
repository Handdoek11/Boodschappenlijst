package J1;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements l {

    /* renamed from: b, reason: collision with root package name */
    private final Collection f3471b;

    public f(l... lVarArr) {
        if (lVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f3471b = Arrays.asList(lVarArr);
    }

    @Override // J1.l
    public L1.c a(Context context, L1.c cVar, int i8, int i9) {
        Iterator it = this.f3471b.iterator();
        L1.c cVar2 = cVar;
        while (it.hasNext()) {
            L1.c a8 = ((l) it.next()).a(context, cVar2, i8, i9);
            if (cVar2 != null && !cVar2.equals(cVar) && !cVar2.equals(a8)) {
                cVar2.b();
            }
            cVar2 = a8;
        }
        return cVar2;
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        Iterator it = this.f3471b.iterator();
        while (it.hasNext()) {
            ((l) it.next()).b(messageDigest);
        }
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f3471b.equals(((f) obj).f3471b);
        }
        return false;
    }

    @Override // J1.e
    public int hashCode() {
        return this.f3471b.hashCode();
    }
}

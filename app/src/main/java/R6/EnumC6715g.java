package r6;

import h6.AbstractC5844b;
import java.io.Serializable;

/* renamed from: r6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC6715g {
    COMPLETE;

    /* renamed from: r6.g$a */
    static final class a implements Serializable {

        /* renamed from: o, reason: collision with root package name */
        final Throwable f42622o;

        a(Throwable th) {
            this.f42622o = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return AbstractC5844b.c(this.f42622o, ((a) obj).f42622o);
            }
            return false;
        }

        public int hashCode() {
            return this.f42622o.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f42622o + "]";
        }
    }

    public static boolean a(Object obj, a6.i iVar) {
        if (obj == COMPLETE) {
            iVar.a();
            return true;
        }
        if (obj instanceof a) {
            iVar.onError(((a) obj).f42622o);
            return true;
        }
        iVar.b(obj);
        return false;
    }

    public static boolean c(Object obj, a6.i iVar) {
        if (obj == COMPLETE) {
            iVar.a();
            return true;
        }
        if (obj instanceof a) {
            iVar.onError(((a) obj).f42622o);
            return true;
        }
        iVar.b(obj);
        return false;
    }

    public static Object f() {
        return COMPLETE;
    }

    public static Object g(Throwable th) {
        return new a(th);
    }

    public static boolean i(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean k(Object obj) {
        return obj instanceof a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static Object h(Object obj) {
        return obj;
    }

    public static Object l(Object obj) {
        return obj;
    }
}

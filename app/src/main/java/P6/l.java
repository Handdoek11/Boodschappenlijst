package P6;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class l extends j implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final a f4440v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    private static final l f4441w = new l(1, 0);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public l(long j8, long j9) {
        super(j8, j9, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (e() != lVar.e() || j() != lVar.j()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (e() ^ (e() >>> 32))) + (j() ^ (j() >>> 32)));
    }

    public boolean isEmpty() {
        return e() > j();
    }

    public boolean o(long j8) {
        return e() <= j8 && j8 <= j();
    }

    public String toString() {
        return e() + ".." + j();
    }
}

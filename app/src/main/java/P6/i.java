package P6;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class i extends g implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final a f4430v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    private static final i f4431w = new i(1, 0);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final i a() {
            return i.f4431w;
        }

        private a() {
        }
    }

    public i(int i8, int i9) {
        super(i8, i9, 1);
    }

    @Override // P6.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (e() != iVar.e() || j() != iVar.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // P6.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + j();
    }

    @Override // P6.g
    public boolean isEmpty() {
        return e() > j();
    }

    public boolean q(int i8) {
        return e() <= i8 && i8 <= j();
    }

    public Integer r() {
        return Integer.valueOf(j());
    }

    public Integer s() {
        return Integer.valueOf(e());
    }

    @Override // P6.g
    public String toString() {
        return e() + ".." + j();
    }
}

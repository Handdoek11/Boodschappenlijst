package j$.util;

/* renamed from: j$.util.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5905l extends C5901h implements java.util.Set, Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f37379b) {
            equals = this.f37378a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int hashCode;
        synchronized (this.f37379b) {
            hashCode = this.f37378a.hashCode();
        }
        return hashCode;
    }
}

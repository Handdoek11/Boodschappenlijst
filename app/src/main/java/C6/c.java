package C6;

import J6.r;
import java.io.Serializable;
import y6.AbstractC6974b;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
final class c extends AbstractC6974b implements a, Serializable {

    /* renamed from: s, reason: collision with root package name */
    private final Enum[] f1119s;

    public c(Enum[] enumArr) {
        r.e(enumArr, "entries");
        this.f1119s = enumArr;
    }

    @Override // y6.AbstractC6973a
    public int b() {
        return this.f1119s.length;
    }

    @Override // y6.AbstractC6973a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return d((Enum) obj);
        }
        return false;
    }

    public boolean d(Enum r32) {
        r.e(r32, "element");
        return ((Enum) AbstractC6980h.z(this.f1119s, r32.ordinal())) == r32;
    }

    @Override // y6.AbstractC6974b, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Enum get(int i8) {
        AbstractC6974b.f44642o.a(i8, this.f1119s.length);
        return this.f1119s[i8];
    }

    @Override // y6.AbstractC6974b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return j((Enum) obj);
        }
        return -1;
    }

    public int j(Enum r32) {
        r.e(r32, "element");
        int ordinal = r32.ordinal();
        if (((Enum) AbstractC6980h.z(this.f1119s, ordinal)) == r32) {
            return ordinal;
        }
        return -1;
    }

    @Override // y6.AbstractC6974b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return n((Enum) obj);
        }
        return -1;
    }

    public int n(Enum r22) {
        r.e(r22, "element");
        return indexOf(r22);
    }
}

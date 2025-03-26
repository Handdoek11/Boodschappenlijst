package C3;

import B3.InterfaceC0392k;

/* loaded from: classes2.dex */
public final class Q implements InterfaceC0392k {

    /* renamed from: o, reason: collision with root package name */
    private final String f896o;

    /* renamed from: s, reason: collision with root package name */
    private final String f897s;

    public Q(InterfaceC0392k interfaceC0392k) {
        this.f896o = interfaceC0392k.d();
        this.f897s = interfaceC0392k.e();
    }

    @Override // B3.InterfaceC0392k
    public final String d() {
        return this.f896o;
    }

    @Override // B3.InterfaceC0392k
    public final String e() {
        return this.f897s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f896o == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f896o);
        }
        sb.append(", key=");
        sb.append(this.f897s);
        sb.append("]");
        return sb.toString();
    }

    @Override // Y2.f
    public final /* bridge */ /* synthetic */ Object q0() {
        return this;
    }
}

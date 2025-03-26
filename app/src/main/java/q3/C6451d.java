package q3;

/* renamed from: q3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6451d implements InterfaceC6491i {

    /* renamed from: a, reason: collision with root package name */
    private final int f41626a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC6483h f41627b;

    C6451d(int i8, EnumC6483h enumC6483h) {
        this.f41626a = i8;
        this.f41627b = enumC6483h;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC6491i.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC6491i)) {
            return false;
        }
        InterfaceC6491i interfaceC6491i = (InterfaceC6491i) obj;
        return this.f41626a == interfaceC6491i.zza() && this.f41627b.equals(interfaceC6491i.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f41626a ^ 14552422) + (this.f41627b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f41626a + "intEncoding=" + this.f41627b + ')';
    }

    @Override // q3.InterfaceC6491i
    public final int zza() {
        return this.f41626a;
    }

    @Override // q3.InterfaceC6491i
    public final EnumC6483h zzb() {
        return this.f41627b;
    }
}

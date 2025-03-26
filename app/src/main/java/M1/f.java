package M1;

/* loaded from: classes.dex */
public final class f implements a {
    @Override // M1.a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // M1.a
    public int b() {
        return 1;
    }

    @Override // M1.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // M1.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i8) {
        return new byte[i8];
    }
}

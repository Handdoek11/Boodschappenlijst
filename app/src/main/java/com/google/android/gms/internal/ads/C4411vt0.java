package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.vt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4411vt0 implements Ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final Lt0 f27380a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2654fl0 f27381b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27382c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f27383d;

    private C4411vt0(Lt0 lt0, InterfaceC2654fl0 interfaceC2654fl0, int i8, byte[] bArr) {
        this.f27380a = lt0;
        this.f27381b = interfaceC2654fl0;
        this.f27382c = i8;
        this.f27383d = bArr;
    }

    public static Ik0 b(C4722yl0 c4722yl0) {
        C3649ot0 c3649ot0 = new C3649ot0(c4722yl0.d().d(Rk0.a()), c4722yl0.b().d());
        String valueOf = String.valueOf(c4722yl0.b().g());
        return new C4411vt0(c3649ot0, new Qt0(new Pt0("HMAC".concat(valueOf), new SecretKeySpec(c4722yl0.e().d(Rk0.a()), "HMAC")), c4722yl0.b().e()), c4722yl0.b().e(), c4722yl0.c().c());
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f27383d;
        int i8 = this.f27382c;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i8 + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!Wp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f27383d.length, length2 - this.f27382c);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.f27382c, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((Qt0) this.f27381b).c(AbstractC4193tt0.b(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.f27380a.a(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}

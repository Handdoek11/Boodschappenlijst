package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ms, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3428ms extends AbstractC4766z7 {

    /* renamed from: c, reason: collision with root package name */
    static final C3428ms f24596c = new C3428ms();

    C3428ms() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4766z7
    public final D7 b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new G7() : "mvhd".equals(str) ? new H7() : new I7(str);
    }
}

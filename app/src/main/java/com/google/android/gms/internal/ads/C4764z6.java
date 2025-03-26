package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.z6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4764z6 implements InterfaceC4655y6 {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f28296a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28297b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28298c;

    public C4764z6(FileChannel fileChannel, long j8, long j9) {
        this.f28296a = fileChannel;
        this.f28297b = j8;
        this.f28298c = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4655y6
    public final void a(MessageDigest[] messageDigestArr, long j8, int i8) {
        MappedByteBuffer map = this.f28296a.map(FileChannel.MapMode.READ_ONLY, this.f28297b + j8, i8);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4655y6
    public final long zza() {
        return this.f28298c;
    }
}

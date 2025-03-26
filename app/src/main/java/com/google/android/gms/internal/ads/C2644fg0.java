package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.gms.internal.ads.fg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2644fg0 extends AbstractC2314ce0 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f22092e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f22093f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f22094g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f22095h;

    /* renamed from: i, reason: collision with root package name */
    private long f22096i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22097j;

    public C2644fg0(Context context) {
        super(false);
        this.f22092e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f22096i;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new zzfu(e8, 2000);
            }
        }
        FileInputStream fileInputStream = this.f22095h;
        int i10 = AbstractC2301cW.f21206a;
        int read = fileInputStream.read(bArr, i8, i9);
        if (read == -1) {
            return -1;
        }
        long j9 = this.f22096i;
        if (j9 != -1) {
            this.f22096i = j9 - read;
        }
        z(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f22093f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        this.f22093f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f22095h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f22095h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f22094g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f22094g = null;
                        if (this.f22097j) {
                            this.f22097j = false;
                            g();
                        }
                    } catch (IOException e8) {
                        throw new zzfu(e8, 2000);
                    }
                } catch (Throwable th) {
                    this.f22095h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f22094g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f22094g = null;
                        if (this.f22097j) {
                            this.f22097j = false;
                            g();
                        }
                        throw th;
                    } catch (IOException e9) {
                        throw new zzfu(e9, 2000);
                    }
                }
            } catch (Throwable th2) {
                this.f22094g = null;
                if (this.f22097j) {
                    this.f22097j = false;
                    g();
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new zzfu(e10, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        int i8;
        AssetFileDescriptor openAssetFileDescriptor;
        long j8;
        try {
            try {
                Uri normalizeScheme = c4393vk0.f27331a.normalizeScheme();
                this.f22093f = normalizeScheme;
                i(c4393vk0);
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.f22092e.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.f22092e.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f22094g = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i8 = 2000;
                    try {
                        throw new zzfu(new IOException("Could not open file descriptor for: " + String.valueOf(normalizeScheme)), 2000);
                    } catch (IOException e8) {
                        e = e8;
                        if (true == (e instanceof FileNotFoundException)) {
                            i8 = 2005;
                        }
                        throw new zzfu(e, i8);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f22095h = fileInputStream;
                if (length != -1 && c4393vk0.f27335e > length) {
                    throw new zzfu(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(c4393vk0.f27335e + startOffset) - startOffset;
                if (skip != c4393vk0.f27335e) {
                    throw new zzfu(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f22096i = -1L;
                        j8 = -1;
                    } else {
                        j8 = size - channel.position();
                        this.f22096i = j8;
                        if (j8 < 0) {
                            throw new zzfu(null, 2008);
                        }
                    }
                } else {
                    j8 = length - skip;
                    this.f22096i = j8;
                    if (j8 < 0) {
                        throw new zzfu(null, 2008);
                    }
                }
                long j9 = c4393vk0.f27336f;
                if (j9 != -1) {
                    if (j8 != -1) {
                        j9 = Math.min(j8, j9);
                    }
                    this.f22096i = j9;
                }
                this.f22097j = true;
                j(c4393vk0);
                long j10 = c4393vk0.f27336f;
                return j10 != -1 ? j10 : this.f22096i;
            } catch (IOException e9) {
                e = e9;
                i8 = 2000;
            }
        } catch (zzfu e10) {
            throw e10;
        }
    }
}

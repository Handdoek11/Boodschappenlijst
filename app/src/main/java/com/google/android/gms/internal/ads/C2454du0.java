package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.du0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2454du0 extends AbstractC2314ce0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f21680e;

    /* renamed from: f, reason: collision with root package name */
    private C4393vk0 f21681f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f21682g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f21683h;

    /* renamed from: i, reason: collision with root package name */
    private long f21684i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21685j;

    public C2454du0(Context context) {
        super(false);
        this.f21680e = context.getApplicationContext();
    }

    private static int k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgv("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor l(Context context, C4393vk0 c4393vk0) {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = c4393vk0.f27331a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new zzgv("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = k(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new zzgv("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e8) {
                    throw new zzgv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e8, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = k(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new zzgv("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzgv("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e9) {
            throw new zzgv(null, e9, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f21684i;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new zzgv(null, e8, 2000);
            }
        }
        InputStream inputStream = this.f21683h;
        int i10 = AbstractC2301cW.f21206a;
        int read = inputStream.read(bArr, i8, i9);
        if (read == -1) {
            if (this.f21684i == -1) {
                return -1;
            }
            throw new zzgv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j9 = this.f21684i;
        if (j9 != -1) {
            this.f21684i = j9 - read;
        }
        z(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        C4393vk0 c4393vk0 = this.f21681f;
        if (c4393vk0 != null) {
            return c4393vk0.f27331a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        this.f21681f = null;
        try {
            try {
                try {
                    InputStream inputStream = this.f21683h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f21683h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f21682g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f21682g = null;
                        if (this.f21685j) {
                            this.f21685j = false;
                            g();
                        }
                    } catch (IOException e8) {
                        throw new zzgv(null, e8, 2000);
                    }
                } catch (Throwable th) {
                    this.f21683h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f21682g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f21682g = null;
                        if (this.f21685j) {
                            this.f21685j = false;
                            g();
                        }
                        throw th;
                    } catch (IOException e9) {
                        throw new zzgv(null, e9, 2000);
                    }
                }
            } catch (Throwable th2) {
                this.f21682g = null;
                if (this.f21685j) {
                    this.f21685j = false;
                    g();
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new zzgv(null, e10, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        long j8;
        this.f21681f = c4393vk0;
        i(c4393vk0);
        AssetFileDescriptor l8 = l(this.f21680e, c4393vk0);
        this.f21682g = l8;
        long length = l8.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f21682g.getFileDescriptor());
        this.f21683h = fileInputStream;
        if (length != -1) {
            try {
                if (c4393vk0.f27335e > length) {
                    throw new zzgv(null, null, 2008);
                }
            } catch (zzgv e8) {
                throw e8;
            } catch (IOException e9) {
                throw new zzgv(null, e9, 2000);
            }
        }
        long startOffset = this.f21682g.getStartOffset();
        long skip = fileInputStream.skip(c4393vk0.f27335e + startOffset) - startOffset;
        if (skip != c4393vk0.f27335e) {
            throw new zzgv(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f21684i = -1L;
                j8 = -1;
            } else {
                j8 = channel.size() - channel.position();
                this.f21684i = j8;
                if (j8 < 0) {
                    throw new zzgv(null, null, 2008);
                }
            }
        } else {
            j8 = length - skip;
            this.f21684i = j8;
            if (j8 < 0) {
                throw new zzfz(2008);
            }
        }
        long j9 = c4393vk0.f27336f;
        if (j9 != -1) {
            if (j8 != -1) {
                j9 = Math.min(j8, j9);
            }
            this.f21684i = j9;
        }
        this.f21685j = true;
        j(c4393vk0);
        long j10 = c4393vk0.f27336f;
        return j10 != -1 ? j10 : this.f21684i;
    }
}

package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ds, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249Ds extends AbstractC1141As {

    /* renamed from: w, reason: collision with root package name */
    private static final Set f14573w = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: x, reason: collision with root package name */
    private static final DecimalFormat f14574x = new DecimalFormat("#,###");

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f14575y = 0;

    /* renamed from: u, reason: collision with root package name */
    private File f14576u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f14577v;

    public C1249Ds(InterfaceC1567Mr interfaceC1567Mr) {
        super(interfaceC1567Mr);
        File cacheDir = this.f13680o.getCacheDir();
        if (cacheDir == null) {
            H2.p.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(AbstractC1228Dd0.a(AbstractC1192Cd0.a(), cacheDir, "admobVideoStreams"));
        this.f14576u = file;
        if (!file.isDirectory() && !this.f14576u.mkdirs()) {
            H2.p.g("Could not create preload cache directory at ".concat(String.valueOf(this.f14576u.getAbsolutePath())));
            this.f14576u = null;
        } else {
            if (this.f14576u.setReadable(true, false) && this.f14576u.setExecutable(true, false)) {
                return;
            }
            H2.p.g("Could not set cache file permissions at ".concat(String.valueOf(this.f14576u.getAbsolutePath())));
            this.f14576u = null;
        }
    }

    private final File t(File file) {
        return new File(AbstractC1228Dd0.a(AbstractC1192Cd0.a(), this.f14576u, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    public final void b() {
        this.f14577v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0361, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0367, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x036f, code lost:
    
        if (H2.p.j(3) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0371, code lost:
    
        H2.p.b("Preloaded " + com.google.android.gms.internal.ads.C1249Ds.f14574x.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0394, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x039d, code lost:
    
        if (r0.isFile() == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x039f, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03a7, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x041c  */
    @Override // com.google.android.gms.internal.ads.AbstractC1141As
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1249Ds.p(java.lang.String):boolean");
    }
}

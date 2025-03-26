package Z2;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: Z2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0775n {

    /* renamed from: b, reason: collision with root package name */
    private static final C0771j f6373b = new C0771j("LibraryVersion", "");

    /* renamed from: c, reason: collision with root package name */
    private static final C0775n f6374c = new C0775n();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f6375a = new ConcurrentHashMap();

    protected C0775n() {
    }

    public static C0775n a() {
        return f6374c;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            Z2.r.g(r9, r2)
            j$.util.concurrent.ConcurrentHashMap r2 = r8.f6375a
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L1a
            j$.util.concurrent.ConcurrentHashMap r0 = r8.f6375a
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L77
            r6 = 0
            r5[r6] = r9     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L77
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L77
            java.lang.Class<Z2.n> r5 = Z2.C0775n.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L77
            if (r4 == 0) goto L5e
            r2.load(r4)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            Z2.j r2 = Z2.C0775n.f6373b     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.<init>()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.append(r9)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.append(r3)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r2.e(r1, r5)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            goto L91
        L57:
            r9 = move-exception
            goto L73
        L59:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L7a
        L5e:
            Z2.j r2 = Z2.C0775n.f6373b     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.<init>()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.append(r0)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.append(r9)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r2.f(r1, r5)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            goto L91
        L73:
            r3 = r4
            goto La7
        L75:
            r2 = move-exception
            goto L79
        L77:
            r9 = move-exception
            goto La7
        L79:
            r4 = r3
        L7a:
            Z2.j r5 = Z2.C0775n.f6373b     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r6.append(r0)     // Catch: java.lang.Throwable -> L77
            r6.append(r9)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L77
            r5.d(r1, r0, r2)     // Catch: java.lang.Throwable -> L77
            r7 = r4
            r4 = r3
            r3 = r7
        L91:
            if (r4 == 0) goto L96
            f3.k.a(r4)
        L96:
            if (r3 != 0) goto La1
            Z2.j r0 = Z2.C0775n.f6373b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.b(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        La1:
            j$.util.concurrent.ConcurrentHashMap r0 = r8.f6375a
            r0.put(r9, r3)
            return r3
        La7:
            if (r3 == 0) goto Lac
            f3.k.a(r3)
        Lac:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.C0775n.b(java.lang.String):java.lang.String");
    }
}

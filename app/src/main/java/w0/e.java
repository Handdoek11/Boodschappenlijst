package w0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l1.AbstractC6167a;
import q.C6406j;
import w0.l;

/* loaded from: classes.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final C6406j f44191a = new C6406j(2);

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator f44192b = new Comparator() { // from class: w0.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.g((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f44193a;

        b(Context context, Uri uri) {
            this.f44193a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // w0.e.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f44193a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e8) {
                Log.w("FontsProvider", "Unable to query the content provider", e8);
                return null;
            }
        }

        @Override // w0.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f44193a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f44194a;

        c(Context context, Uri uri) {
            this.f44194a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // w0.e.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f44194a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e8) {
                Log.w("FontsProvider", "Unable to query the content provider", e8);
                return null;
            }
        }

        @Override // w0.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f44194a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        String f44195a;

        /* renamed from: b, reason: collision with root package name */
        String f44196b;

        /* renamed from: c, reason: collision with root package name */
        List f44197c;

        d(String str, String str2, List list) {
            this.f44195a = str;
            this.f44196b = str2;
            this.f44197c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Objects.equals(this.f44195a, dVar.f44195a) && Objects.equals(this.f44196b, dVar.f44196b) && Objects.equals(this.f44197c, dVar.f44197c);
        }

        public int hashCode() {
            return Objects.hash(this.f44195a, this.f44196b, this.f44197c);
        }
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!Arrays.equals((byte[]) list.get(i8), (byte[]) list2.get(i8))) {
                return false;
            }
        }
        return true;
    }

    private static List d(f fVar, Resources resources) {
        return fVar.b() != null ? fVar.b() : p0.e.c(resources, fVar.c());
    }

    static l.a e(Context context, List list, CancellationSignal cancellationSignal) {
        AbstractC6167a.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                f fVar = (f) list.get(i8);
                ProviderInfo f8 = f(context.getPackageManager(), fVar, context.getResources());
                if (f8 == null) {
                    return l.a.b(1, null);
                }
                arrayList.add(h(context, fVar, f8.authority, cancellationSignal));
            }
            return l.a.a(0, arrayList);
        } finally {
            AbstractC6167a.b();
        }
    }

    static ProviderInfo f(PackageManager packageManager, f fVar, Resources resources) {
        AbstractC6167a.a("FontProvider.getProvider");
        try {
            List d8 = d(fVar, resources);
            d dVar = new d(fVar.e(), fVar.f(), d8);
            ProviderInfo providerInfo = (ProviderInfo) f44191a.c(dVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String e8 = fVar.e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e8, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + e8);
            }
            if (!resolveContentProvider.packageName.equals(fVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + e8 + ", but package was not " + fVar.f());
            }
            List b8 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b8, f44192b);
            for (int i8 = 0; i8 < d8.size(); i8++) {
                ArrayList arrayList = new ArrayList((Collection) d8.get(i8));
                Collections.sort(arrayList, f44192b);
                if (c(b8, arrayList)) {
                    f44191a.d(dVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            AbstractC6167a.b();
            return null;
        } finally {
            AbstractC6167a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b8 = bArr[i8];
            byte b9 = bArr2[i8];
            if (b8 != b9) {
                return b8 - b9;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static w0.l.b[] h(android.content.Context r16, w0.f r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.e.h(android.content.Context, w0.f, java.lang.String, android.os.CancellationSignal):w0.l$b[]");
    }
}

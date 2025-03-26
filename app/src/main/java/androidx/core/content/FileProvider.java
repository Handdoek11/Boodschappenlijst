package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o0.AbstractC6278a;
import org.xmlpull.v1.XmlPullParserException;
import y0.d;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: v, reason: collision with root package name */
    private static final String[] f9189v = {"_display_name", "_size"};

    /* renamed from: w, reason: collision with root package name */
    private static final File f9190w = new File("/");

    /* renamed from: x, reason: collision with root package name */
    private static final HashMap f9191x = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final Object f9192o;

    /* renamed from: s, reason: collision with root package name */
    private String f9193s;

    /* renamed from: t, reason: collision with root package name */
    private b f9194t;

    /* renamed from: u, reason: collision with root package name */
    private final int f9195u;

    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f9196a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f9197b = new HashMap();

        c(String str) {
            this.f9196a = str;
        }

        private boolean d(String str, String str2) {
            String k8 = FileProvider.k(str);
            String k9 = FileProvider.k(str2);
            if (!k8.equals(k9)) {
                if (!k8.startsWith(k9 + '/')) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.content.FileProvider.b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.f9197b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.b
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f9197b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f9196a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f9197b.put(str, file.getCanonicalFile());
            } catch (IOException e8) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e8);
            }
        }
    }

    public FileProvider() {
        this(0);
    }

    private static File b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] c(Object[] objArr, int i8) {
        Object[] objArr2 = new Object[i8];
        System.arraycopy(objArr, 0, objArr2, 0, i8);
        return objArr2;
    }

    private static String[] d(String[] strArr, int i8) {
        String[] strArr2 = new String[i8];
        System.arraycopy(strArr, 0, strArr2, 0, i8);
        return strArr2;
    }

    static XmlResourceParser e(Context context, String str, ProviderInfo providerInfo, int i8) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i8 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i8);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private b f() {
        b bVar;
        synchronized (this.f9192o) {
            try {
                d.d(this.f9193s, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f9194t == null) {
                    this.f9194t = g(getContext(), this.f9193s, this.f9195u);
                }
                bVar = this.f9194t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private static b g(Context context, String str, int i8) {
        b bVar;
        HashMap hashMap = f9191x;
        synchronized (hashMap) {
            try {
                bVar = (b) hashMap.get(str);
                if (bVar == null) {
                    try {
                        try {
                            bVar = j(context, str, i8);
                            hashMap.put(str, bVar);
                        } catch (XmlPullParserException e8) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                        }
                    } catch (IOException e9) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static Uri h(Context context, String str, File file) {
        return g(context, str, 0).b(file);
    }

    private static int i(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static b j(Context context, String str, int i8) {
        c cVar = new c(str);
        XmlResourceParser e8 = e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i8);
        while (true) {
            int next = e8.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = e8.getName();
                File file = null;
                String attributeValue = e8.getAttributeValue(null, "name");
                String attributeValue2 = e8.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f9190w;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] g8 = AbstractC6278a.g(context, null);
                    if (g8.length > 0) {
                        file = g8[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] f8 = AbstractC6278a.f(context);
                    if (f8.length > 0) {
                        file = f8[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a8 = a.a(context);
                    if (a8.length > 0) {
                        file = a8[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, b(file, attributeValue2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f9192o) {
            this.f9193s = str;
        }
        HashMap hashMap = f9191x;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return f().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File a8 = f().a(uri);
        int lastIndexOf = a8.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a8.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(f().a(uri), i(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i8;
        File a8 = f().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f9189v;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i9 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i9] = "_display_name";
                i8 = i9 + 1;
                objArr[i9] = queryParameter == null ? a8.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i9] = "_size";
                i8 = i9 + 1;
                objArr[i9] = Long.valueOf(a8.length());
            }
            i9 = i8;
        }
        String[] d8 = d(strArr3, i9);
        Object[] c8 = c(objArr, i9);
        MatrixCursor matrixCursor = new MatrixCursor(d8, 1);
        matrixCursor.addRow(c8);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected FileProvider(int i8) {
        this.f9192o = new Object();
        this.f9195u = i8;
    }
}

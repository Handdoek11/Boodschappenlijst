package U0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f5322a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f5323b = n(System.getProperty("java.vm.version"));

    /* renamed from: U0.a$a, reason: collision with other inner class name */
    private static final class C0109a {
        static void a(ClassLoader classLoader, List list, File file) {
            IOException[] iOExceptionArr;
            Object obj = a.g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            a.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field g8 = a.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) g8.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                g8.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] b(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
            return (Object[]) a.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    private static void d(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
                return;
            }
            Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    private static void e(Context context, File file, File file2, String str, String str2, boolean z7) {
        Set set = f5322a;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                ClassLoader j8 = j(context);
                if (j8 == null) {
                    return;
                }
                try {
                    d(context);
                } catch (Throwable th) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                }
                File k8 = k(context, file2, str);
                c cVar = new c(file, k8);
                try {
                    try {
                        m(j8, k8, cVar.k(context, str2, false));
                    } catch (IOException e8) {
                        if (!z7) {
                            throw e8;
                        }
                        Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e8);
                        m(j8, k8, cVar.k(context, str2, true));
                    }
                    try {
                        e = null;
                    } catch (IOException e9) {
                        e = e9;
                    }
                    if (e != null) {
                        throw e;
                    }
                } finally {
                    try {
                        cVar.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Object obj, String str, Object[] objArr) {
        Field g8 = g(obj, str);
        Object[] objArr2 = (Object[]) g8.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g8.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field g(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method h(Object obj, String str, Class... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e8) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e8);
            return null;
        }
    }

    private static ClassLoader j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e8) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e8);
            return null;
        }
    }

    private static File k(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            o(file2);
        }
        File file3 = new File(file2, str);
        o(file3);
        return file3;
    }

    public static void l(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f5323b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            ApplicationInfo i8 = i(context);
            if (i8 == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                e(context, new File(i8.sourceDir), new File(i8.dataDir), "secondary-dexes", "", true);
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e8) {
            Log.e("MultiDex", "MultiDex installation failure", e8);
            throw new RuntimeException("MultiDex installation failed (" + e8.getMessage() + ").");
        }
    }

    private static void m(ClassLoader classLoader, File file, List list) {
        if (list.isEmpty()) {
            return;
        }
        C0109a.a(classLoader, list, file);
    }

    static boolean n(String str) {
        boolean z7 = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z7 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z7 ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z7;
    }

    private static void o(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}

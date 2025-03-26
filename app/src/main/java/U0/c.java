package U0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
final class c implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    private final File f5324o;

    /* renamed from: s, reason: collision with root package name */
    private final long f5325s;

    /* renamed from: t, reason: collision with root package name */
    private final File f5326t;

    /* renamed from: u, reason: collision with root package name */
    private final RandomAccessFile f5327u;

    /* renamed from: v, reason: collision with root package name */
    private final FileChannel f5328v;

    /* renamed from: w, reason: collision with root package name */
    private final FileLock f5329w;

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    private static class b extends File {

        /* renamed from: o, reason: collision with root package name */
        public long f5331o;

        public b(File file, String str) {
            super(file, str);
            this.f5331o = -1L;
        }
    }

    c(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f5324o = file;
        this.f5326t = file2;
        this.f5325s = i(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f5327u = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f5328v = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f5329w = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e8) {
                e = e8;
                e(this.f5328v);
                throw e;
            } catch (Error e9) {
                e = e9;
                e(this.f5328v);
                throw e;
            } catch (RuntimeException e10) {
                e = e10;
                e(this.f5328v);
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
            e(this.f5327u);
            throw e;
        } catch (Error e12) {
            e = e12;
            e(this.f5327u);
            throw e;
        } catch (RuntimeException e13) {
            e = e13;
            e(this.f5327u);
            throw e;
        }
    }

    private void d() {
        File[] listFiles = this.f5326t.listFiles(new a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f5326t.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void e(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e8) {
            Log.w("MultiDex", "Failed to close resource", e8);
        }
    }

    private static void f(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    e(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            e(inputStream);
            createTempFile.delete();
            throw th2;
        }
    }

    private static SharedPreferences g(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static long h(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long i(File file) {
        long c8 = d.c(file);
        return c8 == -1 ? c8 - 1 : c8;
    }

    private static boolean j(Context context, File file, long j8, String str) {
        SharedPreferences g8 = g(context);
        if (g8.getLong(str + "timestamp", -1L) == h(file)) {
            if (g8.getLong(str + "crc", -1L) == j8) {
                return false;
            }
        }
        return true;
    }

    private List l(Context context, String str) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f5324o.getName() + ".classes";
        SharedPreferences g8 = g(context);
        int i8 = g8.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i8 + (-1));
        int i9 = 2;
        while (i9 <= i8) {
            b bVar = new b(this.f5326t, str2 + i9 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f5331o = i(bVar);
            long j8 = g8.getLong(str + "dex.crc." + i9, -1L);
            long j9 = g8.getLong(str + "dex.time." + i9, -1L);
            long lastModified = bVar.lastModified();
            if (j9 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = g8;
                if (j8 == bVar.f5331o) {
                    arrayList.add(bVar);
                    i9++;
                    g8 = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j9 + ", modification time: " + lastModified + ", expected crc: " + j8 + ", file crc: " + bVar.f5331o);
        }
        return arrayList;
    }

    private List m() {
        boolean z7;
        String str = this.f5324o.getName() + ".classes";
        d();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f5324o);
        try {
            int i8 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                b bVar = new b(this.f5326t, str + i8 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i9 = 0;
                boolean z8 = false;
                while (i9 < 3 && !z8) {
                    int i10 = i9 + 1;
                    f(zipFile, entry, bVar, str);
                    try {
                        bVar.f5331o = i(bVar);
                        z7 = true;
                    } catch (IOException e8) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e8);
                        z7 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z7 ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f5331o);
                    Log.i("MultiDex", sb.toString());
                    if (!z7) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z8 = z7;
                    i9 = i10;
                }
                if (!z8) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i8 + ")");
                }
                i8++;
                entry = zipFile.getEntry("classes" + i8 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e9) {
                Log.w("MultiDex", "Failed to close resource", e9);
            }
            return arrayList;
        } finally {
        }
    }

    private static void u(Context context, String str, long j8, long j9, List list) {
        SharedPreferences.Editor edit = g(context).edit();
        edit.putLong(str + "timestamp", j8);
        edit.putLong(str + "crc", j9);
        edit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i8 = 2;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            edit.putLong(str + "dex.crc." + i8, bVar.f5331o);
            edit.putLong(str + "dex.time." + i8, bVar.lastModified());
            i8++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5329w.release();
        this.f5328v.close();
        this.f5327u.close();
    }

    List k(Context context, String str, boolean z7) {
        List m8;
        List list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f5324o.getPath() + ", " + z7 + ", " + str + ")");
        if (!this.f5329w.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z7 && !j(context, this.f5324o, this.f5325s, str)) {
            try {
                list = l(context, str);
            } catch (IOException e8) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e8);
                m8 = m();
                u(context, str, h(this.f5324o), this.f5325s, m8);
            }
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        if (z7) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        m8 = m();
        u(context, str, h(this.f5324o), this.f5325s, m8);
        list = m8;
        Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
        return list;
    }
}

package net.jpountz.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public enum Native {
    ;

    private static boolean loaded = false;

    private enum OS {
        WINDOWS("win32", "so"),
        LINUX("linux", "so"),
        MAC("darwin", "dylib"),
        SOLARIS("solaris", "so");

        public final String libExtension;
        public final String name;

        OS(String str, String str2) {
            this.name = str;
            this.libExtension = str2;
        }
    }

    private static String arch() {
        return System.getProperty("os.arch");
    }

    private static void cleanupOldTempLibs() {
        File[] listFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new FilenameFilter() { // from class: net.jpountz.util.Native.1
            private final String searchPattern = "liblz4-java-";

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("liblz4-java-") && !str.endsWith(".lck");
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e8) {
                        System.err.println("Failed to delete old temp lib" + e8.getMessage());
                    }
                }
            }
        }
    }

    public static synchronized boolean isLoaded() {
        boolean z7;
        synchronized (Native.class) {
            z7 = loaded;
        }
        return z7;
    }

    public static synchronized void load() {
        File file;
        synchronized (Native.class) {
            if (loaded) {
                return;
            }
            cleanupOldTempLibs();
            try {
                System.loadLibrary("lz4-java");
                loaded = true;
            } catch (UnsatisfiedLinkError unused) {
                String resourceName = resourceName();
                InputStream resourceAsStream = Native.class.getResourceAsStream(resourceName);
                if (resourceAsStream == null) {
                    throw new UnsupportedOperationException("Unsupported OS/arch, cannot find " + resourceName + ". Please try building from source.");
                }
                File file2 = null;
                try {
                    try {
                        file = File.createTempFile("liblz4-java-", "." + os().libExtension + ".lck");
                        try {
                            File file3 = new File(file.getAbsolutePath().replaceFirst(".lck$", ""));
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = resourceAsStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        } else {
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                    }
                                    fileOutputStream.close();
                                    System.load(file3.getAbsolutePath());
                                    loaded = true;
                                    String str = System.getenv("LZ4JAVA_KEEP_TEMP_JNI_LIB");
                                    String property = System.getProperty("lz4java.jnilib.temp.keep");
                                    if ((str == null || !str.equals("true")) && (property == null || !property.equals("true"))) {
                                        file3.deleteOnExit();
                                    }
                                    file.deleteOnExit();
                                } finally {
                                }
                            } catch (IOException e8) {
                                e = e8;
                                throw new ExceptionInInitializerError("Cannot unpack liblz4-java: " + e);
                            } catch (Throwable th) {
                                th = th;
                                file2 = file3;
                                if (loaded) {
                                    String str2 = System.getenv("LZ4JAVA_KEEP_TEMP_JNI_LIB");
                                    String property2 = System.getProperty("lz4java.jnilib.temp.keep");
                                    if ((str2 == null || !str2.equals("true")) && (property2 == null || !property2.equals("true"))) {
                                        file2.deleteOnExit();
                                    }
                                    file.deleteOnExit();
                                } else {
                                    if (file2 != null && file2.exists() && !file2.delete()) {
                                        throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary native library " + file2);
                                    }
                                    if (file != null && file.exists() && !file.delete()) {
                                        throw new ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary lock file " + file);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e9) {
                            e = e9;
                        }
                    } catch (IOException e10) {
                        e = e10;
                    } catch (Throwable th2) {
                        th = th2;
                        file = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    private static OS os() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return OS.LINUX;
        }
        if (property.contains("Mac")) {
            return OS.MAC;
        }
        if (property.contains("Windows")) {
            return OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return OS.SOLARIS;
        }
        throw new UnsupportedOperationException("Unsupported operating system: " + property);
    }

    private static String resourceName() {
        OS os = os();
        return "/" + Native.class.getPackage().getName().replace('.', '/') + "/" + os.name + "/" + arch() + "/liblz4-java." + os.libExtension;
    }
}

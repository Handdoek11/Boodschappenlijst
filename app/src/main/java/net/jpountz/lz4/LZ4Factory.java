package net.jpountz.lz4;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

/* loaded from: classes2.dex */
public final class LZ4Factory {
    private static LZ4Factory JAVA_SAFE_INSTANCE;
    private static LZ4Factory JAVA_UNSAFE_INSTANCE;
    private static LZ4Factory NATIVE_INSTANCE;
    private final LZ4Compressor fastCompressor;
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4Compressor highCompressor;
    private final LZ4Compressor[] highCompressors;
    private final String impl;
    private final LZ4SafeDecompressor safeDecompressor;

    private LZ4Factory(String str) {
        LZ4Compressor[] lZ4CompressorArr = new LZ4Compressor[18];
        this.highCompressors = lZ4CompressorArr;
        this.impl = str;
        this.fastCompressor = (LZ4Compressor) classInstance("net.jpountz.lz4.LZ4" + str + "Compressor");
        LZ4Compressor lZ4Compressor = (LZ4Compressor) classInstance("net.jpountz.lz4.LZ4HC" + str + "Compressor");
        this.highCompressor = lZ4Compressor;
        this.fastDecompressor = (LZ4FastDecompressor) classInstance("net.jpountz.lz4.LZ4" + str + "FastDecompressor");
        this.safeDecompressor = (LZ4SafeDecompressor) classInstance("net.jpountz.lz4.LZ4" + str + "SafeDecompressor");
        Constructor<?> declaredConstructor = lZ4Compressor.getClass().getDeclaredConstructor(Integer.TYPE);
        lZ4CompressorArr[9] = lZ4Compressor;
        for (int i8 = 1; i8 <= 17; i8++) {
            if (i8 != 9) {
                this.highCompressors[i8] = (LZ4Compressor) declaredConstructor.newInstance(Integer.valueOf(i8));
            }
        }
        byte[] bArr = {97, 98, 99, 100, 32, 32, 32, 32, 32, 32, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106};
        for (LZ4Compressor lZ4Compressor2 : Arrays.asList(this.fastCompressor, this.highCompressor)) {
            int maxCompressedLength = lZ4Compressor2.maxCompressedLength(20);
            byte[] bArr2 = new byte[maxCompressedLength];
            int compress = lZ4Compressor2.compress(bArr, 0, 20, bArr2, 0, maxCompressedLength);
            byte[] bArr3 = new byte[20];
            this.fastDecompressor.decompress(bArr2, 0, bArr3, 0, 20);
            if (!Arrays.equals(bArr, bArr3)) {
                throw new AssertionError();
            }
            Arrays.fill(bArr3, (byte) 0);
            if (this.safeDecompressor.decompress(bArr2, 0, compress, bArr3, 0) != 20 || !Arrays.equals(bArr, bArr3)) {
                throw new AssertionError();
            }
        }
    }

    private static <T> T classInstance(String str) {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static LZ4Factory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public static LZ4Factory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    private static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e8) {
            throw new AssertionError(e8);
        }
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        printStream.println("Fastest instance is " + fastestInstance());
        printStream.println("Fastest Java instance is " + fastestJavaInstance());
    }

    public static synchronized LZ4Factory nativeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            try {
                if (NATIVE_INSTANCE == null) {
                    NATIVE_INSTANCE = instance("JNI");
                }
                lZ4Factory = NATIVE_INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory safeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            try {
                if (JAVA_SAFE_INSTANCE == null) {
                    JAVA_SAFE_INSTANCE = instance("JavaSafe");
                }
                lZ4Factory = JAVA_SAFE_INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            try {
                if (JAVA_UNSAFE_INSTANCE == null) {
                    JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
                }
                lZ4Factory = JAVA_UNSAFE_INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lZ4Factory;
    }

    public LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public LZ4Compressor highCompressor() {
        return this.highCompressor;
    }

    public LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    public String toString() {
        return LZ4Factory.class.getSimpleName() + ":" + this.impl;
    }

    public LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }

    public LZ4Compressor highCompressor(int i8) {
        if (i8 > 17) {
            i8 = 17;
        } else if (i8 < 1) {
            i8 = 9;
        }
        return this.highCompressors[i8];
    }
}

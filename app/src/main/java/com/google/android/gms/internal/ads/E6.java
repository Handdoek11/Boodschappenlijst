package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class E6 {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair c8 = F6.c(randomAccessFile);
            if (c8 == null) {
                throw new zzaoo("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) c8.first;
            long longValue = ((Long) c8.second).longValue();
            long j8 = (-20) + longValue;
            if (j8 >= 0) {
                randomAccessFile.seek(j8);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzaoo("ZIP64 APK not supported");
                }
            }
            long a8 = F6.a(byteBuffer);
            if (a8 >= longValue) {
                throw new zzaoo("ZIP Central Directory offset out of range: " + a8 + ". ZIP End of Central Directory offset: " + longValue);
            }
            if (F6.b(byteBuffer) + a8 != longValue) {
                throw new zzaoo("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (a8 < 32) {
                throw new zzaoo("APK too small for APK Signing Block. ZIP Central Directory offset: " + a8);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(a8 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new zzaoo("No APK Signing Block before ZIP Central Directory");
            }
            int i8 = 0;
            long j9 = allocate.getLong(0);
            if (j9 < allocate.capacity() || j9 > 2147483639) {
                throw new zzaoo("APK Signing Block size out of range: " + j9);
            }
            int i9 = (int) (8 + j9);
            long j10 = a8 - i9;
            if (j10 < 0) {
                throw new zzaoo("APK Signing Block offset out of range: " + j10);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i9);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j10);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j11 = allocate2.getLong(0);
            if (j11 != j9) {
                throw new zzaoo("APK Signing Block sizes in header and footer do not match: " + j11 + " vs " + j9);
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j10));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                while (slice.hasRemaining()) {
                    i8++;
                    if (slice.remaining() < 8) {
                        throw new zzaoo("Insufficient data to read size of APK Signing Block entry #" + i8);
                    }
                    long j12 = slice.getLong();
                    if (j12 < 4 || j12 > 2147483647L) {
                        throw new zzaoo("APK Signing Block entry #" + i8 + " size out of range: " + j12);
                    }
                    int i10 = (int) j12;
                    int position2 = slice.position() + i10;
                    if (i10 > slice.remaining()) {
                        throw new zzaoo("APK Signing Block entry #" + i8 + " size out of range: " + i10 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] l8 = l(randomAccessFile.getChannel(), new A6(e(slice, i10 - 4), longValue2, a8, longValue, byteBuffer, null));
                        randomAccessFile.close();
                        return l8;
                    }
                    slice.position(position2);
                }
                throw new zzaoo("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int b(int i8) {
        if (i8 == 1) {
            return 32;
        }
        if (i8 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i8);
    }

    private static int c(int i8) {
        if (i8 == 513) {
            return 1;
        }
        if (i8 == 514) {
            return 2;
        }
        if (i8 == 769) {
            return 1;
        }
        switch (i8) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i8))));
        }
    }

    private static String d(int i8) {
        if (i8 == 1) {
            return "SHA-256";
        }
        if (i8 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i8);
    }

    private static ByteBuffer e(ByteBuffer byteBuffer, int i8) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i9 = i8 + position;
        if (i9 < position || i9 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i9);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i9);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i8 = byteBuffer.getInt();
        if (i8 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i8 <= byteBuffer.remaining()) {
            return e(byteBuffer, i8);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i8 + ", remaining: " + byteBuffer.remaining());
    }

    private static void g(int i8, byte[] bArr, int i9) {
        bArr[1] = (byte) (i8 & 255);
        bArr[2] = (byte) ((i8 >>> 8) & 255);
        bArr[3] = (byte) ((i8 >>> 16) & 255);
        bArr[4] = (byte) (i8 >> 24);
    }

    private static void h(Map map, FileChannel fileChannel, long j8, long j9, long j10, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        C4764z6 c4764z6 = new C4764z6(fileChannel, 0L, j8);
        C4764z6 c4764z62 = new C4764z6(fileChannel, j9, j10 - j9);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        F6.d(duplicate, j8);
        C4546x6 c4546x6 = new C4546x6(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Integer) it.next()).intValue();
            i8++;
        }
        try {
            byte[][] k8 = k(iArr, new InterfaceC4655y6[]{c4764z6, c4764z62, c4546x6});
            for (int i9 = 0; i9 < size; i9++) {
                int i10 = iArr[i9];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i10)), k8[i9])) {
                    throw new SecurityException(d(i10).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e8) {
            throw new SecurityException("Failed to compute digest(s) of contents", e8);
        }
    }

    private static byte[] i(ByteBuffer byteBuffer) {
        int i8 = byteBuffer.getInt();
        if (i8 < 0) {
            throw new IOException("Negative length");
        }
        if (i8 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i8];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i8 + ", available: " + byteBuffer.remaining());
    }

    private static X509Certificate[] j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer f8 = f(byteBuffer);
        ByteBuffer f9 = f(byteBuffer);
        byte[] i8 = i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i9 = -1;
        int i10 = 0;
        while (f9.hasRemaining()) {
            i10++;
            try {
                ByteBuffer f10 = f(f9);
                if (f10.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i11 = f10.getInt();
                arrayList.add(Integer.valueOf(i11));
                if (i11 != 513 && i11 != 514 && i11 != 769) {
                    switch (i11) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i9 != -1) {
                    int c8 = c(i11);
                    int c9 = c(i9);
                    if (c8 != 1 && c9 == 1) {
                    }
                }
                bArr2 = i(f10);
                i9 = i11;
            } catch (IOException e8) {
                e = e8;
                throw new SecurityException("Failed to parse signature record #" + i10, e);
            } catch (BufferUnderflowException e9) {
                e = e9;
                throw new SecurityException("Failed to parse signature record #" + i10, e);
            }
        }
        if (i9 == -1) {
            if (i10 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i9 == 513 || i9 == 514) {
            str = "EC";
        } else if (i9 != 769) {
            switch (i9) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i9))));
            }
        } else {
            str = "DSA";
        }
        if (i9 == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i9 == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i9 != 769) {
            switch (i9) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i9))));
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i8));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(f8);
            if (!signature.verify(bArr2)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            f8.clear();
            ByteBuffer f11 = f(f8);
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            while (f11.hasRemaining()) {
                i12++;
                try {
                    ByteBuffer f12 = f(f11);
                    if (f12.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i13 = f12.getInt();
                    arrayList2.add(Integer.valueOf(i13));
                    if (i13 == i9) {
                        bArr = i(f12);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException("Failed to parse digest record #" + i12, e);
                } catch (BufferUnderflowException e11) {
                    e = e11;
                    throw new IOException("Failed to parse digest record #" + i12, e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int c10 = c(i9);
            byte[] bArr3 = (byte[]) map.put(Integer.valueOf(c10), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(d(c10).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer f13 = f(f8);
            ArrayList arrayList3 = new ArrayList();
            int i14 = 0;
            while (f13.hasRemaining()) {
                i14++;
                byte[] i15 = i(f13);
                try {
                    arrayList3.add(new B6((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(i15)), i15));
                } catch (CertificateException e12) {
                    throw new SecurityException("Failed to decode certificate #" + i14, e12);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(i8, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e13) {
            e = e13;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e14) {
            e = e14;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e16) {
            e = e16;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e17) {
            e = e17;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }

    private static byte[][] k(int[] iArr, InterfaceC4655y6[] interfaceC4655y6Arr) {
        long j8;
        int i8;
        int length;
        int i9 = 0;
        long j9 = 0;
        int i10 = 0;
        long j10 = 0;
        while (true) {
            j8 = 1048576;
            if (i10 >= 3) {
                break;
            }
            j10 += (interfaceC4655y6Arr[i10].zza() + 1048575) / 1048576;
            i10++;
        }
        if (j10 >= 2097151) {
            throw new DigestException("Too many chunks: " + j10);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i11 = 0;
        while (true) {
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            int i12 = (int) j10;
            byte[] bArr2 = new byte[(b(iArr[i11]) * i12) + 5];
            bArr2[0] = 90;
            g(i12, bArr2, 1);
            bArr[i11] = bArr2;
            i11++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            String d8 = d(iArr[i13]);
            try {
                messageDigestArr[i13] = MessageDigest.getInstance(d8);
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(d8.concat(" digest not supported"), e8);
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (i8 = 3; i14 < i8; i8 = 3) {
            InterfaceC4655y6 interfaceC4655y6 = interfaceC4655y6Arr[i14];
            long j11 = j9;
            long zza = interfaceC4655y6.zza();
            while (zza > j9) {
                int min = (int) Math.min(zza, j8);
                g(min, bArr3, 1);
                for (int i16 = 0; i16 < length; i16++) {
                    messageDigestArr[i16].update(bArr3);
                }
                long j12 = j11;
                try {
                    interfaceC4655y6.a(messageDigestArr, j12, min);
                    byte[] bArr4 = bArr3;
                    int i17 = 0;
                    while (i17 < iArr.length) {
                        int i18 = iArr[i17];
                        InterfaceC4655y6 interfaceC4655y62 = interfaceC4655y6;
                        byte[] bArr5 = bArr[i17];
                        int b8 = b(i18);
                        int i19 = length;
                        MessageDigest messageDigest = messageDigestArr[i17];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i15 * b8) + 5, b8);
                        if (digest != b8) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i17++;
                        interfaceC4655y6 = interfaceC4655y62;
                        length = i19;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j13 = min;
                    long j14 = j12 + j13;
                    zza -= j13;
                    i15++;
                    j9 = 0;
                    j8 = 1048576;
                    bArr3 = bArr4;
                    j11 = j14;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e9) {
                    throw new DigestException("Failed to digest chunk #" + i15 + " of section #" + i9, e9);
                }
            }
            i9++;
            i14++;
            j9 = 0;
            j8 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i20 = 0; i20 < iArr.length; i20++) {
            int i21 = iArr[i20];
            byte[] bArr7 = bArr[i20];
            String d9 = d(i21);
            try {
                bArr6[i20] = MessageDigest.getInstance(d9).digest(bArr7);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(d9.concat(" digest not supported"), e10);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] l(FileChannel fileChannel, A6 a62) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer f8 = f(a62.f13514a);
                int i8 = 0;
                while (f8.hasRemaining()) {
                    i8++;
                    try {
                        arrayList.add(j(f(f8), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e8) {
                        throw new SecurityException("Failed to parse/verify signer #" + i8 + " block", e8);
                    }
                }
                if (i8 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                h(hashMap, fileChannel, a62.f13515b, a62.f13516c, a62.f13517d, a62.f13518e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e9) {
                throw new SecurityException("Failed to read list of signers", e9);
            }
        } catch (CertificateException e10) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e10);
        }
    }
}

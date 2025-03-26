package net.jpountz.lz4;

/* loaded from: classes2.dex */
enum LZ4Utils {
    ;

    private static final int MAX_INPUT_SIZE = 2113929216;

    static class Match {
        int len;
        int ref;
        int start;

        Match() {
        }

        int end() {
            return this.start + this.len;
        }

        void fix(int i8) {
            this.start += i8;
            this.ref += i8;
            this.len -= i8;
        }
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    static int hash(int i8) {
        return (i8 * (-1640531535)) >>> 20;
    }

    static int hash64k(int i8) {
        return (i8 * (-1640531535)) >>> 19;
    }

    static int hashHC(int i8) {
        return (i8 * (-1640531535)) >>> 17;
    }

    static int maxCompressedLength(int i8) {
        if (i8 >= 0) {
            if (i8 < MAX_INPUT_SIZE) {
                return i8 + (i8 / 255) + 16;
            }
            throw new IllegalArgumentException("length must be < 2113929216");
        }
        throw new IllegalArgumentException("length must be >= 0, got " + i8);
    }
}

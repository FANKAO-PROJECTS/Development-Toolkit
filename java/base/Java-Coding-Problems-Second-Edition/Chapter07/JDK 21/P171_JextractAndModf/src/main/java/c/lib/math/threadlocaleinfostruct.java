// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct threadlocaleinfostruct {
 *     int refcount;
 *     unsigned int lc_codepage;
 *     unsigned int lc_collate_cp;
 *     unsigned long lc_handle[6];
 *     LC_ID lc_id[6];
 *     struct  lc_category[6];
 *     int lc_clike;
 *     int mb_cur_max;
 *     int* lconv_intl_refcount;
 *     int* lconv_num_refcount;
 *     int* lconv_mon_refcount;
 *     struct lconv* lconv;
 *     int* ctype1_refcount;
 *     unsigned short* ctype1;
 *     unsigned short* pctype;
 *     unsigned char* pclmap;
 *     unsigned char* pcumap;
 *     struct __lc_time_data* lc_time_curr;
 * };
 * }
 */
public class threadlocaleinfostruct {

    public static MemoryLayout $LAYOUT() {
        return constants$1.const$3;
    }
    public static VarHandle refcount$VH() {
        return constants$1.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int refcount;
     * }
     */
    public static int refcount$get(MemorySegment seg) {
        return (int)constants$1.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int refcount;
     * }
     */
    public static void refcount$set(MemorySegment seg, int x) {
        constants$1.const$4.set(seg, x);
    }
    public static int refcount$get(MemorySegment seg, long index) {
        return (int)constants$1.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void refcount$set(MemorySegment seg, long index, int x) {
        constants$1.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lc_codepage$VH() {
        return constants$1.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int lc_codepage;
     * }
     */
    public static int lc_codepage$get(MemorySegment seg) {
        return (int)constants$1.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int lc_codepage;
     * }
     */
    public static void lc_codepage$set(MemorySegment seg, int x) {
        constants$1.const$5.set(seg, x);
    }
    public static int lc_codepage$get(MemorySegment seg, long index) {
        return (int)constants$1.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lc_codepage$set(MemorySegment seg, long index, int x) {
        constants$1.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lc_collate_cp$VH() {
        return constants$2.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int lc_collate_cp;
     * }
     */
    public static int lc_collate_cp$get(MemorySegment seg) {
        return (int)constants$2.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int lc_collate_cp;
     * }
     */
    public static void lc_collate_cp$set(MemorySegment seg, int x) {
        constants$2.const$0.set(seg, x);
    }
    public static int lc_collate_cp$get(MemorySegment seg, long index) {
        return (int)constants$2.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lc_collate_cp$set(MemorySegment seg, long index, int x) {
        constants$2.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lc_handle$slice(MemorySegment seg) {
        return seg.asSlice(12, 24);
    }
    public static MemorySegment lc_id$slice(MemorySegment seg) {
        return seg.asSlice(36, 36);
    }
    public static MemorySegment lc_category$slice(MemorySegment seg) {
        return seg.asSlice(72, 192);
    }
    public static VarHandle lc_clike$VH() {
        return constants$2.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int lc_clike;
     * }
     */
    public static int lc_clike$get(MemorySegment seg) {
        return (int)constants$2.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int lc_clike;
     * }
     */
    public static void lc_clike$set(MemorySegment seg, int x) {
        constants$2.const$1.set(seg, x);
    }
    public static int lc_clike$get(MemorySegment seg, long index) {
        return (int)constants$2.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lc_clike$set(MemorySegment seg, long index, int x) {
        constants$2.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mb_cur_max$VH() {
        return constants$2.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int mb_cur_max;
     * }
     */
    public static int mb_cur_max$get(MemorySegment seg) {
        return (int)constants$2.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int mb_cur_max;
     * }
     */
    public static void mb_cur_max$set(MemorySegment seg, int x) {
        constants$2.const$2.set(seg, x);
    }
    public static int mb_cur_max$get(MemorySegment seg, long index) {
        return (int)constants$2.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void mb_cur_max$set(MemorySegment seg, long index, int x) {
        constants$2.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lconv_intl_refcount$VH() {
        return constants$2.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int* lconv_intl_refcount;
     * }
     */
    public static MemorySegment lconv_intl_refcount$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int* lconv_intl_refcount;
     * }
     */
    public static void lconv_intl_refcount$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$3.set(seg, x);
    }
    public static MemorySegment lconv_intl_refcount$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lconv_intl_refcount$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lconv_num_refcount$VH() {
        return constants$2.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int* lconv_num_refcount;
     * }
     */
    public static MemorySegment lconv_num_refcount$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int* lconv_num_refcount;
     * }
     */
    public static void lconv_num_refcount$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$4.set(seg, x);
    }
    public static MemorySegment lconv_num_refcount$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lconv_num_refcount$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lconv_mon_refcount$VH() {
        return constants$2.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int* lconv_mon_refcount;
     * }
     */
    public static MemorySegment lconv_mon_refcount$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int* lconv_mon_refcount;
     * }
     */
    public static void lconv_mon_refcount$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$5.set(seg, x);
    }
    public static MemorySegment lconv_mon_refcount$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lconv_mon_refcount$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lconv$VH() {
        return constants$3.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct lconv* lconv;
     * }
     */
    public static MemorySegment lconv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct lconv* lconv;
     * }
     */
    public static void lconv$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$0.set(seg, x);
    }
    public static MemorySegment lconv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lconv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ctype1_refcount$VH() {
        return constants$3.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int* ctype1_refcount;
     * }
     */
    public static MemorySegment ctype1_refcount$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int* ctype1_refcount;
     * }
     */
    public static void ctype1_refcount$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$1.set(seg, x);
    }
    public static MemorySegment ctype1_refcount$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ctype1_refcount$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ctype1$VH() {
        return constants$3.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* ctype1;
     * }
     */
    public static MemorySegment ctype1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* ctype1;
     * }
     */
    public static void ctype1$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$2.set(seg, x);
    }
    public static MemorySegment ctype1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ctype1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pctype$VH() {
        return constants$3.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* pctype;
     * }
     */
    public static MemorySegment pctype$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* pctype;
     * }
     */
    public static void pctype$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$3.set(seg, x);
    }
    public static MemorySegment pctype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pctype$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pclmap$VH() {
        return constants$3.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* pclmap;
     * }
     */
    public static MemorySegment pclmap$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* pclmap;
     * }
     */
    public static void pclmap$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$4.set(seg, x);
    }
    public static MemorySegment pclmap$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pclmap$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pcumap$VH() {
        return constants$3.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* pcumap;
     * }
     */
    public static MemorySegment pcumap$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* pcumap;
     * }
     */
    public static void pcumap$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$5.set(seg, x);
    }
    public static MemorySegment pcumap$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pcumap$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lc_time_curr$VH() {
        return constants$4.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __lc_time_data* lc_time_curr;
     * }
     */
    public static MemorySegment lc_time_curr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __lc_time_data* lc_time_curr;
     * }
     */
    public static void lc_time_curr$set(MemorySegment seg, MemorySegment x) {
        constants$4.const$0.set(seg, x);
    }
    public static MemorySegment lc_time_curr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lc_time_curr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}



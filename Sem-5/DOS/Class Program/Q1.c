#include<stdio.h>
int main(){
	int n;
	printf("Enter the value of n");
	scanf("%d",&n);
	while(n);
	return 0;
}




/%Terminal 1

rituraj@rituraj:~$ ls
Desktop  Documents  Downloads  Music  Pictures  Public  snap  Templates  Videos
rituraj@rituraj:~$ cd Documents/
rituraj@rituraj:/home/rituraj/Documents$ gedit Q1.c
^C
rituraj@rituraj:/home/rituraj/Documents$ gcc Q1.c 
rituraj@rituraj:/home/rituraj/Documents$ ./a.out
^Z
[1]+  Stopped                 ./a.out
rituraj@rituraj:/home/rituraj/Documents$ ./a.out
^C[1]+  Terminated              ./a.out

rituraj@rituraj:/home/rituraj/Documents$ ^C
rituraj@rituraj:/home/rituraj/Documents$ gedit Q1.c
^C
rituraj@rituraj:/home/rituraj/Documents$ ./a.out
^C
rituraj@rituraj:/home/rituraj/Documents$ gcc Q1.c 
rituraj@rituraj:/home/rituraj/Documents$ ./a.out
Enter the value of n5
^Z
[1]+  Stopped                 ./a.out
rituraj@rituraj:/home/rituraj/Documents$ man ps
[1]+  Killed                  ./a.out
rituraj@rituraj:/home/rituraj/Documents$ man ps
rituraj@rituraj:/home/rituraj/Documents$ man ps
rituraj@rituraj:/home/rituraj/Documents$ man ps
rituraj@rituraj:/home/rituraj/Documents$ ^C
rituraj@rituraj:/home/rituraj/Documents$ man ps
rituraj@rituraj:/home/rituraj/Documents

*/



/* Terminal 2

rituraj@rituraj:/home/rituraj/Documents$ ps -al
F S   UID     PID    PPID  C PRI  NI ADDR SZ WCHAN  TTY          TIME CMD
4 S  1000    1510    1508  0  80   0 - 192269 ep_pol tty2    00:00:46 Xorg
0 S  1000    1534    1508  0  80   0 - 49822 poll_s tty2     00:00:00 gnome-session-b
0 R  1000    4541    3316 99  80   0 -   591 -      pts/0    00:00:15 a.out
4 R  1000    4549    3988  0  80   0 -  5013 -      pts/1    00:00:00 ps
rituraj@rituraj:/home/rituraj/Documents$ ps -al
F S   UID     PID    PPID  C PRI  NI ADDR SZ WCHAN  TTY          TIME CMD
4 S  1000    1510    1508  0  80   0 - 192265 ep_pol tty2    00:00:48 Xorg
0 S  1000    1534    1508  0  80   0 - 49822 poll_s tty2     00:00:00 gnome-session-b
4 R  1000    4582    3988  0  80   0 -  5013 -      pts/1    00:00:00 ps
rituraj@rituraj:/home/rituraj/Documents$ ps -al
F S   UID     PID    PPID  C PRI  NI ADDR SZ WCHAN  TTY          TIME CMD
4 S  1000    1510    1508  0  80   0 - 192311 ep_pol tty2    00:00:56 Xorg
0 S  1000    1534    1508  0  80   0 - 49822 poll_s tty2     00:00:00 gnome-session-b
0 S  1000    4714    3316  0  80   0 -   624 wait_w pts/0    00:00:00 a.out
4 R  1000    4717    3988  0  80   0 -  5013 -      pts/1    00:00:00 ps
rituraj@rituraj:/home/rituraj/Documents$ ps -al
F S   UID     PID    PPID  C PRI  NI ADDR SZ WCHAN  TTY          TIME CMD
4 S  1000    1510    1508  0  80   0 - 192336 ep_pol tty2    00:00:59 Xorg
0 S  1000    1534    1508  0  80   0 - 49822 poll_s tty2     00:00:00 gnome-session-b
0 R  1000    4714    3316 15  80   0 -   624 -      pts/0    00:00:18 a.out
4 R  1000    4777    3988  0  80   0 -  5013 -      pts/1    00:00:00 ps
rituraj@rituraj:/home/rituraj/Documents$ ps -al
F S   UID     PID    PPID  C PRI  NI ADDR SZ WCHAN  TTY          TIME CMD
4 R  1000    1510    1508  1  80   0 - 192521 -     tty2     00:01:05 Xorg
0 S  1000    1534    1508  0  80   0 - 49822 poll_s tty2     00:00:00 gnome-session-b
0 T  1000    4714    3316 14  80   0 -   624 do_sig pts/0    00:00:45 a.out
4 R  1000    4861    3988  0  80   0 -  5013 -      pts/1    00:00:00 ps
rituraj@rituraj:/home/rituraj/Documents$ kill 4714
rituraj@rituraj:/home/rituraj/Documents$ ps -al
F S   UID     PID    PPID  C PRI  NI ADDR SZ WCHAN  TTY          TIME CMD
4 R  1000    1510    1508  1  80   0 - 192521 -     tty2     00:01:07 Xorg
0 S  1000    1534    1508  0  80   0 - 49822 poll_s tty2     00:00:00 gnome-session-b
0 T  1000    4714    3316 12  80   0 -   624 do_sig pts/0    00:00:45 a.out
4 R  1000    4866    3988  0  80   0 -  5013 -      pts/1    00:00:00 ps
rituraj@rituraj:/home/rituraj/Documents$ ps -al
F S   UID     PID    PPID  C PRI  NI ADDR SZ WCHAN  TTY          TIME CMD
4 S  1000    1510    1508  1  80   0 - 192505 ep_pol tty2    00:01:07 Xorg
0 S  1000    1534    1508  0  80   0 - 49822 poll_s tty2     00:00:00 gnome-session-b
0 T  1000    4714    3316 12  80   0 -   624 do_sig pts/0    00:00:45 a.out
4 R  1000    4867    3988  0  80   0 -  5013 -      pts/1    00:00:00 ps
rituraj@rituraj:/home/rituraj/Documents$ kill -4714
bash: kill: 4714: invalid signal specification
rituraj@rituraj:/home/rituraj/Documents$ kill -9 4714
rituraj@rituraj:/home/rituraj/Documents$ ps -al
F S   UID     PID    PPID  C PRI  NI ADDR SZ WCHAN  TTY          TIME CMD
4 R  1000    1510    1508  1  80   0 - 192505 -     tty2     00:01:08 Xorg
0 S  1000    1534    1508  0  80   0 - 49822 poll_s tty2     00:00:00 gnome-session-b
4 R  1000    4870    3988  0  80   0 -  5013 -      pts/1    00:00:00 ps
rituraj@rituraj:/home/rituraj/Documents$ 

*/

/*man PS

PS(1)                                 User Commands                                PS(1)

NNAAMMEE
       ps - report a snapshot of the current processes.

SSYYNNOOPPSSIISS
       ppss [_o_p_t_i_o_n_s]

DDEESSCCRRIIPPTTIIOONN
       ppss displays information about a selection of the active processes.  If you want a
       repetitive update of the selection and the displayed information, use _t_o_p(1)
       instead.

       This version of ppss accepts several kinds of options:

       1   UNIX options, which may be grouped and must be preceded by a dash.
       2   BSD options, which may be grouped and must not be used with a dash.
       3   GNU long options, which are preceded by two dashes.

       Options of different types may be freely mixed, but conflicts can appear.  There
       are some synonymous options, which are functionally identical, due to the many
       standards and ppss implementations that this ppss is compatible with.

       Note that "ppss --aauuxx" is distinct from "ppss aauuxx".  The POSIX and UNIX standards
       require that "ppss --aauuxx" print all processes owned by a user named "x", as well as
       printing all processes that would be selected by the --aa option.  If the user
       named "x" does not exist, this ppss may interpret the command as "ppss aauuxx" instead
       and print a warning.  This behavior is intended to aid in transitioning old
       scripts and habits.  It is fragile, subject to change, and thus should not be
       relied upon.

       By default, ppss selects all processes with the same effective user ID (euid=EUID)
       as the current user and associated with the same terminal as the invoker.  It
       displays the process ID (pid=PID), the terminal associated with the process
       (tname=TTY), the cumulated CPU time in [DD-]hh:mm:ss format (time=TIME), and the
       executable name (ucmd=CMD).  Output is unsorted by default.

       The use of BSD-style options will add process state (stat=STAT) to the default
       display and show the command args (args=COMMAND) instead of the executable name.
       You can override this with the PPSS__FFOORRMMAATT environment variable.  The use of
       BSD-style options will also change the process selection to include processes on
       other terminals (TTYs) that are owned by you; alternately, this may be described
       as setting the selection to be the set of all processes filtered to exclude
       processes owned by other users or not on a terminal.  These effects are not
       considered when options are described as being "identical" below, so --MM will be
       considered identical to ZZ and so on.

       Except as described below, process selection options are additive.  The default
       selection is discarded, and then the selected processes are added to the set of
       processes to be displayed.  A process will thus be shown if it meets any of the
       given selection criteria.

EEXXAAMMPPLLEESS
       To see every process on the system using standard syntax:
          ppss --ee
          ppss --eeff
          ppss --eeFF
          ppss --eellyy

       To see every process on the system using BSD syntax:
          ppss aaxx
          ppss aaxxuu

       To print a process tree:
          ppss --eejjHH
          ppss aaxxjjff

       To get info about threads:
          ppss --eeLLff
          ppss aaxxmmss

       To get security info:
          ppss --eeoo eeuusseerr,,rruusseerr,,ssuusseerr,,ffuusseerr,,ff,,ccoommmm,,llaabbeell
          ppss aaxxZZ
          ppss --eeMM

       To see every process running as root (real & effective ID) in user format:
          ppss --UU rroooott --uu rroooott uu

       To see every process with a user-defined format:
          ppss --eeoo ppiidd,,ttiidd,,ccllaassss,,rrttpprriioo,,nnii,,pprrii,,ppssrr,,ppccppuu,,ssttaatt,,wwcchhaann::1144,,ccoommmm
          ppss aaxxoo ssttaatt,,eeuuiidd,,rruuiidd,,ttttyy,,ttppggiidd,,sseessss,,ppggrrpp,,ppppiidd,,ppiidd,,ppccppuu,,ccoommmm
          ppss --AAoo ppiidd,,tttt,,uusseerr,,ffnnaammee,,ttmmoouutt,,ff,,wwcchhaann

       Print only the process IDs of syslogd:
          ppss --CC ssyyssllooggdd --oo ppiidd==

       Print only the name of PID 42:
          ppss --qq 4422 --oo ccoommmm==

SSIIMMPPLLEE PPRROOCCEESSSS SSEELLEECCTTIIOONN
       aa      Lift the BSD-style "only yourself" restriction, which is imposed upon the
              set of all processes when some BSD-style (without "-") options are used or
              when the ppss personality setting is BSD-like.  The set of processes
              selected in this manner is in addition to the set of processes selected by
              other means.  An alternate description is that this option causes ppss to
              list all processes with a terminal (tty), or to list all processes when
              used together with the xx option.

       --AA     Select all processes.  Identical to --ee.

       --aa     Select all processes except both session leaders (see _g_e_t_s_i_d(2)) and
              processes not associated with a terminal.

       --dd     Select all processes except session leaders.

       ----ddeesseelleecctt
              Select all processes except those that fulfill the specified conditions
              (negates the selection).  Identical to --NN.

       --ee     Select all processes.  Identical to --AA.

       gg      Really all, even session leaders.  This flag is obsolete and may be
              discontinued in a future release.  It is normally implied by the aa flag,
              and is only useful when operating in the sunos4 personality.

       --NN     Select all processes except those that fulfill the specified conditions
              (negates the selection).  Identical to ----ddeesseelleecctt.

       TT      Select all processes associated with this terminal.  Identical to the tt
              option without any argument.

       rr      Restrict the selection to only running processes.

       xx      Lift the BSD-style "must have a tty" restriction, which is imposed upon
              the set of all processes when some BSD-style (without "-") options are
              used or when the ppss personality setting is BSD-like.  The set of processes
              selected in this manner is in addition to the set of processes selected by
              other means.  An alternate description is that this option causes ppss to
              list all processes owned by you (same EUID as ppss), or to list all
              processes when used together with the aa option.

PPRROOCCEESSSS SSEELLEECCTTIIOONN BBYY LLIISSTT
       These options accept a single argument in the form of a blank-separated or
       comma-separated list.  They can be used multiple times.  For example:
       ppss --pp ""11 22"" --pp 33,,44

       -_1_2_3   Identical to ----ppiidd _1_2_3.

       _1_2_3    Identical to ----ppiidd _1_2_3.

       --CC _c_m_d_l_i_s_t
              Select by command name.  This selects the processes whose executable name
              is given in _c_m_d_l_i_s_t.  NOTE: The command name is not the same as the
              command line. Previous versions of procps and the kernel truncated this
              command name to 15 characters. This limitation is no longer present in
              both. If you depended on matching only 15 characters, you may no longer
              get a match.

       --GG _g_r_p_l_i_s_t
              Select by real group ID (RGID) or name.  This selects the processes whose
              real group name or ID is in the _g_r_p_l_i_s_t list.  The real group ID
              identifies the group of the user who created the process, see _g_e_t_g_i_d(2).

       --gg _g_r_p_l_i_s_t
              Select by session OR by effective group name.  Selection by session is
              specified by many standards, but selection by effective group is the
              logical behavior that several other operating systems use.  This ppss will
              select by session when the list is completely numeric (as sessions are).
              Group ID numbers will work only when some group names are also specified.
              See the --ss and ----ggrroouupp options.

       ----GGrroouupp _g_r_p_l_i_s_t
              Select by real group ID (RGID) or name.  Identical to --GG.

       ----ggrroouupp _g_r_p_l_i_s_t
              Select by effective group ID (EGID) or name.  This selects the processes
              whose effective group name or ID is in _g_r_p_l_i_s_t.  The effective group ID
              describes the group whose file access permissions are used by the process
              (see _g_e_t_e_g_i_d(2)).  The --gg option is often an alternative to ----ggrroouupp.

       pp _p_i_d_l_i_s_t
              Select by process ID.  Identical to --pp and ----ppiidd.

       --pp _p_i_d_l_i_s_t
              Select by PID.  This selects the processes whose process ID numbers appear
              in _p_i_d_l_i_s_t.  Identical to pp and ----ppiidd.

       ----ppiidd _p_i_d_l_i_s_t
              Select by process ID.  Identical to --pp and pp.

       ----ppppiidd _p_i_d_l_i_s_t
              Select by parent process ID.  This selects the processes with a parent
              process ID in _p_i_d_l_i_s_t.  That is, it selects processes that are children of
              those listed in _p_i_d_l_i_s_t.

       qq _p_i_d_l_i_s_t
              Select by process ID (quick mode).  Identical to --qq and ----qquuiicckk--ppiidd.

       --qq _p_i_d_l_i_s_t
              Select by PID (quick mode).  This selects the processes whose process ID
              numbers appear in _p_i_d_l_i_s_t.  With this option ppss reads the necessary info
              only for the pids listed in the _p_i_d_l_i_s_t and doesn't apply additional
              filtering rules.  The order of pids is unsorted and preserved.  No
              additional selection options, sorting and forest type listings are allowed
              in this mode.  Identical to qq and ----qquuiicckk--ppiidd.

       ----qquuiicckk--ppiidd _p_i_d_l_i_s_t
              Select by process ID (quick mode).  Identical to --qq and qq.

       --ss _s_e_s_s_l_i_s_t
              Select by session ID.  This selects the processes with a session ID
              specified in _s_e_s_s_l_i_s_t.

       ----ssiidd _s_e_s_s_l_i_s_t
              Select by session ID.  Identical to --ss.

       tt _t_t_y_l_i_s_t
              Select by tty.  Nearly identical to --tt and ----ttttyy, but can also be used
              with an empty _t_t_y_l_i_s_t to indicate the terminal associated with ppss.  Using
              the TT option is considered cleaner than using tt with an empty _t_t_y_l_i_s_t.

       --tt _t_t_y_l_i_s_t
              Select by tty.  This selects the processes associated with the terminals
              given in _t_t_y_l_i_s_t.  Terminals (ttys, or screens for text output) can be
              specified in several forms: /dev/ttyS1, ttyS1, S1.  A plain "-" may be
              used to select processes not attached to any terminal.

       ----ttttyy _t_t_y_l_i_s_t
              Select by terminal.  Identical to --tt and tt.

       UU _u_s_e_r_l_i_s_t
              Select by effective user ID (EUID) or name.  This selects the processes
              whose effective user name or ID is in _u_s_e_r_l_i_s_t.  The effective user ID
              describes the user whose file access permissions are used by the process
              (see _g_e_t_e_u_i_d(2)).  Identical to --uu and ----uusseerr.

       --UU _u_s_e_r_l_i_s_t
              Select by real user ID (RUID) or name.  It selects the processes whose
              real user name or ID is in the _u_s_e_r_l_i_s_t list.  The real user ID identifies
              the user who created the process, see _g_e_t_u_i_d(2).

       --uu _u_s_e_r_l_i_s_t
              Select by effective user ID (EUID) or name.  This selects the processes
              whose effective user name or ID is in _u_s_e_r_l_i_s_t.

              The effective user ID describes the user whose file access permissions are
              used by the process (see _g_e_t_e_u_i_d(2)).  Identical to UU and ----uusseerr.

       ----UUsseerr _u_s_e_r_l_i_s_t
              Select by real user ID (RUID) or name.  Identical to --UU.

       ----uusseerr _u_s_e_r_l_i_s_t
              Select by effective user ID (EUID) or name.  Identical to --uu and UU.

OOUUTTPPUUTT FFOORRMMAATT CCOONNTTRROOLL
       These options are used to choose the information displayed by ppss.  The output may
       differ by personality.

       --cc     Show different scheduler information for the --ll option.

       ----ccoonntteexxtt
              Display security context format (for SELinux).

       --ff     Do full-format listing.  This option can be combined with many other
              UNIX-style options to add additional columns.  It also causes the command
              arguments to be printed.  When used with --LL, the NLWP (number of threads)
              and LWP (thread ID) columns will be added.  See the cc option, the format
              keyword aarrggss, and the format keyword ccoommmm.

       --FF     Extra full format.  See the --ff option, which --FF implies.

       ----ffoorrmmaatt _f_o_r_m_a_t
              user-defined format.  Identical to --oo and oo.

       jj      BSD job control format.

       --jj     Jobs format.

       ll      Display BSD long format.

       --ll     Long format.  The --yy option is often useful with this.

       --MM     Add a column of security data.  Identical to ZZ (for SELinux).

       OO _f_o_r_m_a_t
              is preloaded oo (overloaded).  The BSD OO option can act like --OO
              (user-defined output format with some common fields predefined) or can be
              used to specify sort order.  Heuristics are used to determine the behavior
              of this option.  To ensure that the desired behavior is obtained (sorting
              or formatting), specify the option in some other way (e.g.  with --OO or
              ----ssoorrtt).  When used as a formatting option, it is identical to --OO, with
              the BSD personality.

       --OO _f_o_r_m_a_t
              Like --oo, but preloaded with some default columns.  Identical to --oo ppiidd,,
              _f_o_r_m_a_t,,ssttaattee,,ttnnaammee,,ttiimmee,,ccoommmmaanndd or --oo ppiidd,,_f_o_r_m_a_t,,ttnnaammee,,ttiimmee,,ccmmdd, see --oo
              below.

       oo _f_o_r_m_a_t
              Specify user-defined format.  Identical to --oo and ----ffoorrmmaatt.

       --oo _f_o_r_m_a_t
              User-defined format.  _f_o_r_m_a_t is a single argument in the form of a
              blank-separated or comma-separated list, which offers a way to specify
              individual output columns.  The recognized keywords are described in the
              SSTTAANNDDAARRDD FFOORRMMAATT SSPPEECCIIFFIIEERRSS section below.  Headers may be renamed (ppss --oo
              ppiidd,,rruusseerr==RReeaallUUsseerr --oo ccoommmm==CCoommmmaanndd) as desired.  If all column headers are
              empty (ppss --oo ppiidd== --oo ccoommmm==) then the header line will not be output.
              Column width will increase as needed for wide headers; this may be used to
              widen up columns such as WCHAN (ppss --oo ppiidd,,wwcchhaann==WWIIDDEE--WWCCHHAANN--CCOOLLUUMMNN --oo
              ccoommmm).  Explicit width control (ppss ooppiidd,,wwcchhaann::4422,,ccmmdd) is offered too.  The
              behavior of ppss --oo ppiidd==XX,,ccoommmm==YY varies with personality; output may be one
              column named "X,comm=Y" or two columns named "X" and "Y".  Use multiple --oo
              options when in doubt.  Use the PPSS__FFOORRMMAATT environment variable to specify
              a default as desired; DefSysV and DefBSD are macros that may be used to
              choose the default UNIX or BSD columns.

       ss      Display signal format.

       uu      Display user-oriented format.

       vv      Display virtual memory format.

       XX      Register format.

       --yy     Do not show flags; show rss in place of addr.  This option can only be
              used with --ll.

       ZZ      Add a column of security data.  Identical to --MM (for SELinux).

OOUUTTPPUUTT MMOODDIIFFIIEERRSS
       cc      Show the true command name.  This is derived from the name of the
              executable file, rather than from the argv value.  Command arguments and
              any modifications to them are thus not shown.  This option effectively
              turns the aarrggss format keyword into the ccoommmm format keyword; it is useful
              with the --ff format option and with the various BSD-style format options,
              which all normally display the command arguments.  See the --ff option, the
              format keyword aarrggss, and the format keyword ccoommmm.

       ----ccoollss _n
              Set screen width.

       ----ccoolluummnnss _n
              Set screen width.

       ----ccuummuullaattiivvee
              Include some dead child process data (as a sum with the parent).

       ee      Show the environment after the command.

       ff      ASCII art process hierarchy (forest).

       ----ffoorreesstt
              ASCII art process tree.

       hh      No header.  (or, one header per screen in the BSD personality).  The hh
              option is problematic.  Standard BSD ppss uses this option to print a header
              on each page of output, but older Linux ppss uses this option to totally
              disable the header.  This version of ppss follows the Linux usage of not
              printing the header unless the BSD personality has been selected, in which
              case it prints a header on each page of output.  Regardless of the current
              personality, you can use the long options ----hheeaaddeerrss and ----nnoo--hheeaaddeerrss to
              enable printing headers each page or disable headers entirely,
              respectively.

       --HH     Show process hierarchy (forest).

       ----hheeaaddeerrss
              Repeat header lines, one per page of output.

       kk _s_p_e_c Specify sorting order.  Sorting syntax is [++|--]_k_e_y[,[++|--]_k_e_y[,...]].
              Choose a multi-letter key from the SSTTAANNDDAARRDD FFOORRMMAATT SSPPEECCIIFFIIEERRSS section.
              The "+" is optional since default direction is increasing numerical or
              lexicographic order.  Identical to ----ssoorrtt.

                      Examples:
                      ppss jjaaxxkkuuiidd,,--ppppiidd,,++ppiidd
                      ppss aaxxkk ccoommmm oo ccoommmm,,aarrggss
                      ppss kkssttaarrtt__ttiimmee --eeff

       ----lliinneess _n
              Set screen height.

       nn      Numeric output for WCHAN and USER (including all types of UID and GID).

       ----nnoo--hheeaaddeerrss
              Print no header line at all.  ----nnoo--hheeaaddiinngg is an alias for this option.

       OO _o_r_d_e_r
              Sorting order (overloaded).  The BSD OO option can act like --OO
              (user-defined output format with some common fields predefined) or can be
              used to specify sort order.  Heuristics are used to determine the behavior
              of this option.  To ensure that the desired behavior is obtained (sorting
              or formatting), specify the option in some other way (e.g.  with --OO or
              ----ssoorrtt).

              For sorting, obsolete BSD OO option syntax is OO[++|--]_k_1[,[++|--]_k_2[,...]].  It
              orders the processes listing according to the multilevel sort specified by
              the sequence of one-letter short keys _k_1,_k_2, ... described in the OOBBSSOOLLEETTEE
              SSOORRTT KKEEYYSS section below.  The "+" is currently optional, merely
              re-iterating the default direction on a key, but may help to distinguish
              an OO sort from an OO format.  The "-" reverses direction only on the key it
              precedes.

       ----rroowwss _n
              Set screen height.

       SS      Sum up some information, such as CPU usage, from dead child processes into
              their parent.  This is useful for examining a system where a parent
              process repeatedly forks off short-lived children to do work.

       ----ssoorrtt _s_p_e_c
              Specify sorting order.  Sorting syntax is [_+|_-]_k_e_y[,[++|--]_k_e_y[,...]].
              Choose a multi-letter key from the SSTTAANNDDAARRDD FFOORRMMAATT SSPPEECCIIFFIIEERRSS section.
              The "+" is optional since default direction is increasing numerical or
              lexicographic order.  Identical to kk.  For example: ppss jjaaxx ----ssoorrtt==uuiidd,,
              --ppppiidd,,++ppiidd

       ww      Wide output.  Use this option twice for unlimited width.

       --ww     Wide output.  Use this option twice for unlimited width.

       ----wwiiddtthh _n
              Set screen width.

TTHHRREEAADD DDIISSPPLLAAYY
       HH      Show threads as if they were processes.

       --LL     Show threads, possibly with LWP and NLWP columns.

       mm      Show threads after processes.

       --mm     Show threads after processes.

       --TT     Show threads, possibly with SPID column.

OOTTHHEERR IINNFFOORRMMAATTIIOONN
       ----hheellpp _s_e_c_t_i_o_n
              Print a help message.  The section argument can be one of _simple, _list,
              _output, _threads, _misc, or _all.  The argument can be shortened to one of
              the underlined letters as in: s|l|o|t|m|a.

       ----iinnffoo Print debugging info.

       LL      List all format specifiers.

       VV      Print the procps-ng version.

       --VV     Print the procps-ng version.

       ----vveerrssiioonn
              Print the procps-ng version.

NNOOTTEESS
       This ppss works by reading the virtual files in /proc.  This ppss does not need to be
       setuid kmem or have any privileges to run.  Do not give this ppss any special
       permissions.

       CPU usage is currently expressed as the percentage of time spent running during
       the entire lifetime of a process.  This is not ideal, and it does not conform to
       the standards that ppss otherwise conforms to.  CPU usage is unlikely to add up to
       exactly 100%.

       The SIZE and RSS fields don't count some parts of a process including the page
       tables, kernel stack, struct thread_info, and struct task_struct.  This is
       usually at least 20 KiB of memory that is always resident.  SIZE is the virtual
       size of the process (code+data+stack).

       Processes marked <defunct> are dead processes (so-called "zombies") that remain
       because their parent has not destroyed them properly.  These processes will be
       destroyed by _i_n_i_t(8) if the parent process exits.

       If the length of the username is greater than the length of the display column,
       the username will be truncated.  See the -o and -O formatting options to
       customize length.

       Commands options such as ppss --aauuxx are not recommended as it is a confusion of two
       different standards.  According to the POSIX and UNIX standards, the above
       command asks to display all processes with a TTY (generally the commands users
       are running) plus all processes owned by a user named "x".  If that user doesn't
       exist, then ppss will assume you really meant "ppss _a_u_x".

PPRROOCCEESSSS FFLLAAGGSS
       The sum of these values is displayed in the "F" column, which is provided by the
       ffllaaggss output specifier:

               1    forked but didn't exec
               4    used super-user privileges

PPRROOCCEESSSS SSTTAATTEE CCOODDEESS
       Here are the different values that the ss, ssttaatt and ssttaattee output specifiers
       (header "STAT" or "S") will display to describe the state of a process:

               D    uninterruptible sleep (usually IO)
               I    Idle kernel thread
               R    running or runnable (on run queue)
               S    interruptible sleep (waiting for an event to complete)
               T    stopped by job control signal
               t    stopped by debugger during the tracing
               W    paging (not valid since the 2.6.xx kernel)
               X    dead (should never be seen)
               Z    defunct ("zombie") process, terminated but not reaped by its parent

       For BSD formats and when the ssttaatt keyword is used, additional characters may be
       displayed:

               <    high-priority (not nice to other users)
               N    low-priority (nice to other users)
               L    has pages locked into memory (for real-time and custom IO)
               s    is a session leader
               l    is multi-threaded (using CLONE_THREAD, like NPTL pthreads do)
               +    is in the foreground process group

OOBBSSOOLLEETTEE SSOORRTT KKEEYYSS
       These keys are used by the BSD OO option (when it is used for sorting).  The GNU
       ----ssoorrtt option doesn't use these keys, but the specifiers described below in the
       SSTTAANNDDAARRDD FFOORRMMAATT SSPPEECCIIFFIIEERRSS section.  Note that the values used in sorting are the
       internal values ppss uses and not the "cooked" values used in some of the output
       format fields (e.g.  sorting on tty will sort into device number, not according
       to the terminal name displayed).  Pipe ppss output into the ssoorrtt(1) command if you
       want to sort the cooked values.

       KKEEYY   LLOONNGG         DDEESSCCRRIIPPTTIIOONN
       c     cmd          simple name of executable
       C     pcpu         cpu utilization
       f     flags        flags as in long format F field
       g     pgrp         process group ID
       G     tpgid        controlling tty process group ID
       j     cutime       cumulative user time
       J     cstime       cumulative system time
       k     utime        user time
       m     min_flt      number of minor page faults
       M     maj_flt      number of major page faults
       n     cmin_flt     cumulative minor page faults
       N     cmaj_flt     cumulative major page faults
       o     session      session ID
       p     pid          process ID
       P     ppid         parent process ID
       r     rss          resident set size
       R     resident     resident pages
       s     size         memory size in kilobytes
       S     share        amount of shared pages
       t     tty          the device number of the controlling tty
       T     start_time   time process was started
       U     uid          user ID number
       u     user         user name
       v     vsize        total VM size in KiB
       y     priority     kernel scheduling priority

AAIIXX FFOORRMMAATT DDEESSCCRRIIPPTTOORRSS
       This ppss supports AIX format descriptors, which work somewhat like the formatting
       codes of _p_r_i_n_t_f(1) and _p_r_i_n_t_f(3).  For example, the normal default output can be
       produced with this: ppss --eeoo ""%%pp %%yy %%xx %%cc"".  The NNOORRMMAALL codes are described in the
       next section.

       CCOODDEE   NNOORRMMAALL   HHEEAADDEERR
       %C     pcpu     %CPU
       %G     group    GROUP
       %P     ppid     PPID
       %U     user     USER
       %a     args     COMMAND

       %c     comm     COMMAND
       %g     rgroup   RGROUP
       %n     nice     NI
       %p     pid      PID
       %r     pgid     PGID
       %t     etime    ELAPSED
       %u     ruser    RUSER
       %x     time     TIME
       %y     tty      TTY
       %z     vsz      VSZ

SSTTAANNDDAARRDD FFOORRMMAATT SSPPEECCIIFFIIEERRSS
       Here are the different keywords that may be used to control the output format
       (e.g., with option --oo) or to sort the selected processes with the GNU-style
       ----ssoorrtt option.

       For example: ppss --eeoo ppiidd,,uusseerr,,aarrggss ----ssoorrtt uusseerr

       This version of ppss tries to recognize most of the keywords used in other
       implementations of ppss.

       The following user-defined format specifiers may contain spaces: aarrggss, ccmmdd, ccoommmm,
       ccoommmmaanndd, ffnnaammee, uuccmmdd, uuccoommmm, llssttaarrtt, bbssddssttaarrtt, ssttaarrtt.

       Some keywords may not be available for sorting.

       CCOODDEE        HHEEAADDEERR    DDEESSCCRRIIPPTTIIOONN

       %%ccppuu        %CPU      cpu utilization of the process in "##.#" format.
                             Currently, it is the CPU time used divided by the time the
                             process has been running (cputime/realtime ratio),
                             expressed as a percentage.  It will not add up to 100%
                             unless you are lucky.  (alias ppccppuu).

       %%mmeemm        %MEM      ratio of the process's resident set size  to the physical
                             memory on the machine, expressed as a percentage.  (alias
                             ppmmeemm).

       aarrggss        COMMAND   command with all its arguments as a string.  Modifications
                             to the arguments may be shown.  The output in this column
                             may contain spaces.  A process marked <defunct> is partly
                             dead, waiting to be fully destroyed by its parent.
                             Sometimes the process args will be unavailable; when this
                             happens, ppss will instead print the executable name in
                             brackets.  (alias ccmmdd, ccoommmmaanndd).  See also the ccoommmm format
                             keyword, the --ff option, and the cc option.
                             When specified last, this column will extend to the edge of
                             the display.  If ppss can not determine display width, as
                             when output is redirected (piped) into a file or another
                             command, the output width is undefined (it may be 80,
                             unlimited, determined by the TTEERRMM variable, and so on).
                             The CCOOLLUUMMNNSS environment variable or ----ccoollss option may be
                             used to exactly determine the width in this case.  The ww or
                             --ww option may be also be used to adjust width.

       bblloocckkeedd     BLOCKED   mask of the blocked signals, see _s_i_g_n_a_l(7).  According to
                             the width of the field, a 32 or 64-bit mask in hexadecimal
                             format is displayed.  (alias ssiigg__bblloocckk, ssiiggmmaasskk).

       bbssddssttaarrtt    START     time the command started.  If the process was started less
                             than 24 hours ago, the output format is " HH:MM", else it
                             is " Mmm:SS" (where Mmm is the three letters of the month).
                             See also llssttaarrtt, ssttaarrtt, ssttaarrtt__ttiimmee, and ssttiimmee.

       bbssddttiimmee     TIME      accumulated cpu time, user + system.  The display format is
                             usually "MMM:SS", but can be shifted to the right if the
                             process used more than 999 minutes of cpu time.

       cc           C         processor utilization.  Currently, this is the integer
                             value of the percent usage over the lifetime of the
                             process.  (see %%ccppuu).

       ccaauugghhtt      CAUGHT    mask of the caught signals, see _s_i_g_n_a_l(7).  According to
                             the width of the field, a 32 or 64 bits mask in hexadecimal
                             format is displayed.  (alias ssiigg__ccaattcchh, ssiiggccaattcchh).

       ccggnnaammee      CGNAME    display name of control groups to which the process
                             belongs.

       ccggrroouupp      CGROUP    display control groups to which the process belongs.

       ccllaassss       CLS       scheduling class of the process.  (alias ppoolliiccyy, ccllss).
                             Field's possible values are:

                                      -   not reported
                                      TS  SCHED_OTHER
                                      FF  SCHED_FIFO
                                      RR  SCHED_RR
                                      B   SCHED_BATCH
                                      ISO SCHED_ISO
                                      IDL SCHED_IDLE
                                      DLN SCHED_DEADLINE
                                      ?   unknown value

       ccllss         CLS       scheduling class of the process.  (alias ppoolliiccyy, ccllss).
                             Field's possible values are:

                                      -   not reported
                                      TS  SCHED_OTHER
                                      FF  SCHED_FIFO
                                      RR  SCHED_RR
                                      B   SCHED_BATCH
                                      ISO SCHED_ISO
                                      IDL SCHED_IDLE
                                      DLN SCHED_DEADLINE
                                      ?   unknown value

       ccmmdd         CMD       see aarrggss.  (alias aarrggss, ccoommmmaanndd).

       ccoommmm        COMMAND   command name (only the executable name).  Modifications to
                             the command name will not be shown.  A process marked
                             <defunct> is partly dead, waiting to be fully destroyed by
                             its parent.  The output in this column may contain spaces.
                             (alias uuccmmdd, uuccoommmm).  See also the aarrggss ffoorrmmaatt kkeeyywwoorrdd,, the
                             --ff option, and the cc option.
                             When specified last, this column will extend to the edge of
                             the display.  If ppss can not determine display width, as
                             when output is redirected (piped) into a file or another
                             command, the output width is undefined (it may be 80,
                             unlimited, determined by the TTEERRMM variable, and so on).
                             The CCOOLLUUMMNNSS environment variable or ----ccoollss option may be
                             used to exactly determine the width in this case.  The
                             ww or --ww option may be also be used to adjust width.

       ccoommmmaanndd     COMMAND   See aarrggss.  (alias aarrggss, ccoommmmaanndd).

       ccpp          CP        per-mill (tenths of a percent) CPU usage.  (see %%ccppuu).

       ccppuuttiimmee     TIME      cumulative CPU time, "[DD-]hh:mm:ss" format.  (alias ttiimmee).

       ccppuuttiimmeess    TIME      cumulative CPU time in seconds (alias ttiimmeess).

       ddrrss         DRS       data resident set size, the amount of physical memory
                             devoted to other than executable code.

       eeggiidd        EGID      effective group ID number of the process as a decimal
                             integer.  (alias ggiidd).

       eeggrroouupp      EGROUP    effective group ID of the process.  This will be the
                             textual group ID, if it can be obtained and the field width
                             permits, or a decimal representation otherwise.  (alias
                             ggrroouupp).

       eeiipp         EIP       instruction pointer.

       eesspp         ESP       stack pointer.

       eettiimmee       ELAPSED   elapsed time since the process was started, in the form
                             [[DD-]hh:]mm:ss.

       eettiimmeess      ELAPSED   elapsed time since the process was started, in seconds.

       eeuuiidd        EUID      effective user ID (alias uuiidd).

       eeuusseerr       EUSER     effective user name.  This will be the textual user ID, if
                             it can be obtained and the field width permits, or a
                             decimal representation otherwise.  The nn option can be used
                             to force the decimal representation.  (alias uunnaammee, uusseerr).

       ff           F         flags associated with the process, see the PPRROOCCEESSSS FFLLAAGGSS
                             section.  (alias ffllaagg, ffllaaggss).

       ffggiidd        FGID      filesystem access group ID.  (alias ffssggiidd).

       ffggrroouupp      FGROUP    filesystem access group ID.  This will be the textual group
                             ID, if it can be obtained and the field width permits, or a
                             decimal representation otherwise.  (alias ffssggrroouupp).

       ffllaagg        F         see ff.  (alias ff, ffllaaggss).

       ffllaaggss       F         see ff.  (alias ff, ffllaagg).

       ffnnaammee       COMMAND   first 8 bytes of the base name of the process's executable
                             file.  The output in this column may contain spaces.

       ffuuiidd        FUID      filesystem access user ID.  (alias ffssuuiidd).

       ffuusseerr       FUSER     filesystem access user ID.  This will be the textual user
                             ID, if it can be obtained and the field width permits, or a
                             decimal representation otherwise.

       ggiidd         GID       see eeggiidd.  (alias eeggiidd).

       ggrroouupp       GROUP     see eeggrroouupp.  (alias eeggrroouupp).

       iiggnnoorreedd     IGNORED   mask of the ignored signals, see _s_i_g_n_a_l(7).  According to
                             the width of the field, a 32 or 64 bits mask in hexadecimal
                             format is displayed.  (alias ssiigg__iiggnnoorree, ssiiggiiggnnoorree).

       iippccnnss       IPCNS     Unique inode number describing the namespace the process
                             belongs to.  See namespaces(7).

       llaabbeell       LABEL     security label, most commonly used for SELinux context
                             data.  This is for the _M_a_n_d_a_t_o_r_y _A_c_c_e_s_s _C_o_n_t_r_o_l ("MAC")
                             found on high-security systems.

       llssttaarrtt      STARTED   time the command started.  See also bbssddssttaarrtt, ssttaarrtt,
                             ssttaarrtt__ttiimmee, and ssttiimmee.

       llsseessssiioonn    SESSION   displays the login session identifier of a process, if
                             systemd support has been included.

       lluuiidd        LUID      displays Login ID associated with a process.

       llwwpp         LWP       light weight process (thread) ID of the dispatchable entity
                             (alias ssppiidd, ttiidd).  See ttiidd for additional information.

       llxxcc         LXC       The name of the lxc container within which a task is
                             running.  If a process is not running inside a container, a
                             dash ('-') will be shown.

       mmaacchhiinnee     MACHINE   displays the machine name for processes assigned to VM or
                             container, if systemd support has been included.

       mmaajj__fflltt     MAJFLT    The number of major page faults that have occurred with
                             this process.

       mmiinn__fflltt     MINFLT    The number of minor page faults that have occurred with
                             this process.

       mmnnttnnss       MNTNS     Unique inode number describing the namespace the process
                             belongs to.  See namespaces(7).

       nneettnnss       NETNS     Unique inode number describing the namespace the process
                             belongs to.  See namespaces(7).

       nnii          NI        nice value.  This ranges from 19 (nicest) to -20 (not nice
                             to others), see _n_i_c_e(1).  (alias nniiccee).

       nniiccee        NI        see nnii.((aalliiaass nnii).

       nnllwwpp        NLWP      number of lwps (threads) in the process.  (alias tthhccoouunntt).

       nnuummaa        NUMA      The node assocated with the most recently used processor.
                             A -1 means that NUMA information is unavailable.

       nnwwcchhaann      WCHAN     address of the kernel function where the process is
                             sleeping (use wwcchhaann if you want the kernel function name).
                             Running tasks will display a dash ('-') in this column.

       oouuiidd        OWNER     displays the Unix user identifier of the owner of the
                             session of a process, if systemd support has been included.

       ppccppuu        %CPU      see %%ccppuu.  (alias %%ccppuu).

       ppeennddiinngg     PENDING   mask of the pending signals.  See _s_i_g_n_a_l(7).  Signals
                             pending on the process are distinct from signals pending on
                             individual threads.  Use the mm option or the --mm option to
                             see both.  According to the width of the field, a 32 or 64
                             bits mask in hexadecimal format is displayed.  (alias ssiigg).

       ppggiidd        PGID      process group ID or, equivalently, the process ID of the
                             process group leader.  (alias ppggrrpp).

       ppggrrpp        PGRP      see ppggiidd.  (alias ppggiidd).

       ppiidd         PID       a number representing the process ID (alias ttggiidd).

       ppiiddnnss       PIDNS     Unique inode number describing the namespace the process
                             belongs to.  See namespaces(7).

       ppmmeemm        %MEM      see %%mmeemm.  (alias %%mmeemm).

       ppoolliiccyy      POL       scheduling class of the process.  (alias ccllaassss, ccllss).
                             Possible values are:

                                      -   not reported
                                      TS  SCHED_OTHER
                                      FF  SCHED_FIFO
                                      RR  SCHED_RR
                                      B   SCHED_BATCH
                                      ISO SCHED_ISO
                                      IDL SCHED_IDLE
                                      DLN SCHED_DEADLINE
                                      ?   unknown value

       ppppiidd        PPID      parent process ID.

       pprrii         PRI       priority of the process.  Higher number means lower
                             priority.

       ppssrr         PSR       processor that process is currently assigned to.

       rrggiidd        RGID      real group ID.

       rrggrroouupp      RGROUP    real group name.  This will be the textual group ID, if it
                             can be obtained and the field width permits, or a decimal
                             representation otherwise.

       rrssss         RSS       resident set size, the non-swapped physical memory that a
                             task has used (in kilobytes).  (alias rrssssiizzee, rrsszz).

       rrssssiizzee      RSS       see rrssss.  (alias rrssss, rrsszz).

       rrsszz         RSZ       see rrssss.  (alias rrssss, rrssssiizzee).

       rrttpprriioo      RTPRIO    realtime priority.

       rruuiidd        RUID      real user ID.

       rruusseerr       RUSER     real user ID.  This will be the textual user ID, if it can
                             be obtained and the field width permits, or a decimal
                             representation otherwise.

       ss           S         minimal state display (one character).  See section PPRROOCCEESSSS
                             SSTTAATTEE CCOODDEESS for the different values.  See also ssttaatt if you
                             want additional information displayed.  (alias ssttaattee).

       sscchheedd       SCH       scheduling policy of the process.  The policies SCHED_OTHER
                             (SCHED_NORMAL), SCHED_FIFO, SCHED_RR, SCHED_BATCH,
                             SCHED_ISO, SCHED_IDLE and SCHED_DEADLINE are respectively
                             displayed as 0, 1, 2, 3, 4, 5 and 6.

       sseeaatt        SEAT      displays the identifier associated with all hardware
                             devices assigned to a specific workplace, if systemd
                             support has been included.

       sseessss        SESS      session ID or, equivalently, the process ID of the session
                             leader.  (alias sseessssiioonn, ssiidd).

       ssggii__pp       P         processor that the process is currently executing on.
                             Displays "*" if the process is not currently running or
                             runnable.

       ssggiidd        SGID      saved group ID.  (alias ssvvggiidd).

       ssggrroouupp      SGROUP    saved group name.  This will be the textual group ID, if it
                             can be obtained and the field width permits, or a decimal
                             representation otherwise.

       ssiidd         SID       see sseessss.  (alias sseessss, sseessssiioonn).

       ssiigg         PENDING   see ppeennddiinngg.  (alias ppeennddiinngg, ssiigg__ppeenndd).

       ssiiggccaattcchh    CAUGHT    see ccaauugghhtt.  (alias ccaauugghhtt, ssiigg__ccaattcchh).

       ssiiggiiggnnoorree   IGNORED   see iiggnnoorreedd.  (alias iiggnnoorreedd, ssiigg__iiggnnoorree).

       ssiiggmmaasskk     BLOCKED   see bblloocckkeedd.  (alias bblloocckkeedd, ssiigg__bblloocckk).

       ssiizzee        SIZE      approximate amount of swap space that would be required if
                             the process were to dirty all writable pages and then be
                             swapped out.  This number is very rough!

       sslliiccee       SLICE     displays the slice unit which a process belongs to, if
                             systemd support has been included.

       ssppiidd        SPID      see llwwpp.  (alias llwwpp, ttiidd).

       ssttaacckkpp      STACKP    address of the bottom (start) of stack for the process.

       ssttaarrtt       STARTED   time the command started.  If the process was started less
                             than 24 hours ago, the output format is "HH:MM:SS", else it
                             is "  Mmm dd" (where Mmm is a three-letter month name).
                             See also llssttaarrtt, bbssddssttaarrtt, ssttaarrtt__ttiimmee, and ssttiimmee.

       ssttaarrtt__ttiimmee  START     starting time or date of the process.  Only the year will
                             be displayed if the process was not started the same year
                             ppss was invoked, or "MmmDD" if it was not started the same
                             day, or "HH:MM" otherwise.  See also bbssddssttaarrtt, ssttaarrtt,
                             llssttaarrtt, and ssttiimmee.

       ssttaatt        STAT      multi-character process state.  See section PPRROOCCEESSSS SSTTAATTEE
                             CCOODDEESS for the different values meaning.  See also
                             ss and ssttaattee if you just want the first character displayed.

       ssttaattee       S         see ss. (alias ss).

       ssuuiidd        SUID      saved user ID.  (alias ssvvuuiidd).

       ssuuppggiidd      SUPGID    group ids of supplementary groups, if any.  See
                             ggeettggrroouuppss(2).

       ssuuppggrrpp      SUPGRP    group names of supplementary groups, if any.  See
                             ggeettggrroouuppss(2).

       ssuusseerr       SUSER     saved user name.  This will be the textual user ID, if it
                             can be obtained and the field width permits, or a decimal
                             representation otherwise.  (alias ssvvuusseerr).

       ssvvggiidd       SVGID     see ssggiidd.  (alias ssggiidd).

       ssvvuuiidd       SVUID     see ssuuiidd.  (alias ssuuiidd).

       sszz          SZ        size in physical pages of the core image of the process.
                             This includes text, data, and stack space.  Device mappings
                             are currently excluded; this is subject to change.  See
                             vvsszz and rrssss.

       ttggiidd        TGID      a number representing the thread group to which a task
                             belongs (alias ppiidd).  It is the process ID of the thread
                             group leader.

       tthhccoouunntt     THCNT     see nnllwwpp.  (alias nnllwwpp).  number of kernel threads owned by
                             the process.

       ttiidd         TID       the unique number representing a dispatchable entity (alias
                             llwwpp, ssppiidd).  This value may also appear as: a process ID
                             (pid); a process group ID (pgrp); a session ID for the
                             session leader (sid); a thread group ID for the thread
                             group leader (tgid); and a tty process group ID for the
                             process group leader (tpgid).

       ttiimmee        TIME      cumulative CPU time, "[DD-]HH:MM:SS" format.  (alias
                             ccppuuttiimmee).

       ttiimmeess       TIME      cumulative CPU time in seconds (alias ccppuuttiimmeess).

       ttnnaammee       TTY       controlling tty (terminal).  (alias tttt, ttttyy).

       ttppggiidd       TPGID     ID of the foreground process group on the tty (terminal)
                             that the process is connected to, or -1 if the process is
                             not connected to a tty.

       ttrrss         TRS       text resident set size, the amount of physical memory
                             devoted to executable code.

       tttt          TT        controlling tty (terminal).  (alias ttnnaammee, ttttyy).

       ttttyy         TT        controlling tty (terminal).  (alias ttnnaammee, tttt).

       uuccmmdd        CMD       see ccoommmm.  (alias ccoommmm, uuccoommmm).

       uuccoommmm       COMMAND   see ccoommmm.  (alias ccoommmm, uuccmmdd).

       uuiidd         UID       see eeuuiidd.  (alias eeuuiidd).

       uunnaammee       USER      see eeuusseerr.  (alias eeuusseerr, uusseerr).

       uunniitt        UNIT      displays unit which a process belongs to, if systemd
                             support has been included.

       uusseerr        USER      see eeuusseerr.  (alias eeuusseerr, uunnaammee).

       uusseerrnnss      USERNS    Unique inode number describing the namespace the process
                             belongs to.  See namespaces(7).

       uuttssnnss       UTSNS     Unique inode number describing the namespace the process
                             belongs to.  See namespaces(7).

       uuuunniitt       UUNIT     displays user unit which a process belongs to, if systemd
                             support has been included.

       vvssiizzee       VSZ       see vvsszz.  (alias vvsszz).

       vvsszz         VSZ       virtual memory size of the process in KiB (1024-byte
                             units).  Device mappings are currently excluded; this is
                             subject to change.  (alias vvssiizzee).

       wwcchhaann       WCHAN     name of the kernel function in which the process is
                             sleeping, a "-" if the process is running, or a "*" if the
                             process is multi-threaded and ppss is not displaying threads.

EENNVVIIRROONNMMEENNTT VVAARRIIAABBLLEESS
       The following environment variables could affect ppss:

       CCOOLLUUMMNNSS
          Override default display width.

       LLIINNEESS
          Override default display height.

       PPSS__PPEERRSSOONNAALLIITTYY
          Set to one of posix, old, linux, bsd, sun, digital... (see section PPEERRSSOONNAALLIITTYY
          below).

       CCMMDD__EENNVV
          Set to one of posix, old, linux, bsd, sun, digital... (see section PPEERRSSOONNAALLIITTYY
          below).

       II__WWAANNTT__AA__BBRROOKKEENN__PPSS
          Force obsolete command line interpretation.

       LLCC__TTIIMMEE
          Date format.

       PPSS__CCOOLLOORRSS
          Not currently supported.

       PPSS__FFOORRMMAATT
          Default output format override.  You may set this to a format string of the
          type used for the --oo option.  The DDeeffSSyyssVV and DDeeffBBSSDD values are particularly
          useful.

       PPOOSSIIXXLLYY__CCOORRRREECCTT
          Don't find excuses to ignore bad "features".

       PPOOSSIIXX22
          When set to "on", acts as PPOOSSIIXXLLYY__CCOORRRREECCTT.

       UUNNIIXX9955
          Don't find excuses to ignore bad "features".

       __XXPPGG
          Cancel CCMMDD__EENNVV=_i_r_i_x non-standard behavior.

       In general, it is a bad idea to set these variables.  The one exception is
       CCMMDD__EENNVV or PPSS__PPEERRSSOONNAALLIITTYY, which could be set to Linux for normal systems.
       Without that setting, ppss follows the useless and bad parts of the Unix98
       standard.

PPEERRSSOONNAALLIITTYY
       390        like the OS/390 OpenEdition ppss
       aix        like AIX ppss
       bsd        like FreeBSD ppss (totally non-standard)
       compaq     like Digital Unix ppss
       debian     like the old Debian ppss
       digital    like Tru64 (was Digital Unix, was OSF/1) ppss
       gnu        like the old Debian ppss
       hp         like HP-UX ppss
       hpux       like HP-UX ppss
       irix       like Irix ppss
       linux      ***** rreeccoommmmeennddeedd *****
       old        like the original Linux ppss (totally non-standard)
       os390      like OS/390 Open Edition ppss
       posix      standard
       s390       like OS/390 Open Edition ppss
       sco        like SCO ppss
       sgi        like Irix ppss
       solaris2   like Solaris 2+ (SunOS 5) ppss
       sunos4     like SunOS 4 (Solaris 1) ppss (totally non-standard)
       svr4       standard
       sysv       standard
       tru64      like Tru64 (was Digital Unix, was OSF/1) ppss
       unix       standard
       unix95     standard
       unix98     standard

SSEEEE AALLSSOO
       ppggrreepp(1), ppssttrreeee(1), ttoopp(1), pprroocc(5).

SSTTAANNDDAARRDDSS
       This ppss conforms to:

       1   Version 2 of the Single Unix Specification
       2   The Open Group Technical Standard Base Specifications, Issue 6
       3   IEEE Std 1003.1, 2004 Edition
       4   X/Open System Interfaces Extension [UP XSI]
       5   ISO/IEC 9945:2003

AAUUTTHHOORR
       ppss was originally written by Branko Lankester ⟨lankeste@fwi.uva.nl⟩.  Michael K.
       Johnson ⟨johnsonm@redhat.com⟩ re-wrote it significantly to use the proc filesys‐
       tem, changing a few things in the process.  Michael Shields ⟨mjshield@nyx.cs.du.
       edu⟩ added the pid-list feature.  Charles Blake ⟨cblake@bbn.com⟩ added
       multi-level sorting, the dirent-style library, the device name-to-number mmaped
       database, the approximate binary search directly on System.map, and many code and
       documentation cleanups.  David Mossberger-Tang wrote the generic BFD support for
       psupdate.  Albert Cahalan ⟨albert@users.sf.net⟩ rewrote ps for full Unix98 and
       BSD support, along with some ugly hacks for obsolete and foreign syntax.

       Please send bug reports to ⟨procps@freelists.org⟩.  No subscription is required
       or suggested.

procps-ng                              2018-08-08                                  PS(1)

*/
